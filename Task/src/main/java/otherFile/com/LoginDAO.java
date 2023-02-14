package otherFile.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	public String validate(LoginPojo loginPojo) throws SQLException {
		
		String sql= "select * from login where uname=? and pwd=?";
		DBAdapter adapter= new DBAdapter();
		Connection con = adapter.dbConnect();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, loginPojo.getUname());
		pst.setString(2, loginPojo.getPwd());
		
		ResultSet resultSet =pst.executeQuery();
		if(resultSet.last())
		{
			return "Success";
		}
		else {
			return "Error";
		}
	}
}
