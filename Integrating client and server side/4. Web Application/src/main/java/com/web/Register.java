package com.web;

import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;
import javax.servlet.http.*;
import javax.servlet.*;

public class Register extends HttpServlet{
	static final String DB_URL = "jdbc:mysql://localhost:3306/webapp";
	static final String USER = "root";
	static final String PASS = "spencer@7";
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.print(e);
		}
		ResultSet rs = null;
		int id=0;
		String username=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		int age=Integer.parseInt(req.getParameter("age"));
		String phone=req.getParameter("phone");
		try(
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		Statement stmt = conn.createStatement();) 
		{	
		String sql = "INSERT INTO users(name,email,phone,age,pass)"+ "VALUES(?,?,?,?,?)";

		PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, username);
		ps.setString(2, email);
		ps.setString(3, phone);
		ps.setInt(4, age);
		ps.setString(5, password);
		
		int rowAffected = ps.executeUpdate();
		if(rowAffected == 1)
        {
            rs = ps.getGeneratedKeys();
            if(rs.next())
               id= rs.getInt(1);

    		System.out.println("user is registered");
        }
		                              
		}
		catch (SQLException e) {
	         e.printStackTrace();
	      }
		
		RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
		rd.forward(req, res);
		
		
	}

}
