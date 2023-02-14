

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import otherFile.com.LoginDAO;
import otherFile.com.LoginPojo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginCtrl
 */
@WebServlet("/LoginCtrl")
public class LoginCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String uname =request.getParameter("uname");
		String pwd =request.getParameter("pwd");
		
		if(uname.equals("admin") && pwd.equals("admin123"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("adminMenu.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			LoginPojo loginPojo =new LoginPojo(uname, pwd);
			LoginDAO loginDAO = new LoginDAO();
			
			try {
				String str=loginDAO.validate(loginPojo);
				if(str.equals("Success"))
				{
					RequestDispatcher dispatcher=request.getRequestDispatcher("selectSet.jsp");
					dispatcher.forward(request, response);
				}
				else
				{
					printWriter.print("Incorrect Username or Password");
					RequestDispatcher dispatcher=request.getRequestDispatcher("loginPage.jsp");
					dispatcher.forward(request, response);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
