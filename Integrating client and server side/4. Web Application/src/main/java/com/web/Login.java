package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Login extends HttpServlet{
	static final String DB_URL = "jdbc:mysql://localhost:3306/webapp";
	static final String USER = "root";
	static final String PASS = "spencer@7";
	ResultSet rs = null;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		System.out.println(email);
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.print(e);
		}

			 try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
			      PreparedStatement preparedStatement = connection.prepareStatement("select * from users where email= ?")) 
			 {
	              preparedStatement.setString(1, email);
	              System.out.println(preparedStatement);
	              ResultSet rs = preparedStatement.executeQuery();
	              rs.next();
	 			 if(password.equals(rs.getString("pass")))
	 			 {
	 				 System.out.print("password is right");
	 				 res.setContentType("text/html");
	 				
	 				PrintWriter out = res.getWriter();
	 				
	 				out.print("<html><body>");
	 				out.print("<h2>Welcome "+rs.getString("name")+"</h2>");
	 				out.print("<form action='login.jsp'> <input type='submit' value='logout'></form>");
	 				out.print("</body></html>");
	 				
	 			 }
	 			 else
	 			 {
	 				 System.out.print("incorret password");
	 				 
	 			 } 

		 }
		 catch(SQLException e)
		 {
			 System.out.println(e);
		 }	 	
	}

}
