<%@page import="otherFile.com.RegiDAO"%>
<%@page import="java.time.LocalDate"%>
<%@page import="otherFile.com.RegiPojo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   String name=request.getParameter("name");
   String email=request.getParameter("email");
   String pwd=request.getParameter("pwd");
   String gender=request.getParameter("gender");
   String country=request.getParameter("country");
   String phno=request.getParameter("phno");
   
   LocalDate rdate=LocalDate.now();
   RegiPojo rpojo=new RegiPojo(name,email,pwd,gender,country,Long.parseLong(phno),rdate.toString());
   
   RegiDAO rdao=new RegiDAO();
   String str=rdao.insert(rpojo);
   
   if(str.equals("success"))
   {
	   %>
	   <jsp:forward page="login.jsp"></jsp:forward>
	   <%
   }
   else
   {
	   %>
	   <%="Incorrect Data" %>
	   <jsp:include page="regi.jsp"></jsp:include>
	 <%
   }
%>
</body>
</html>