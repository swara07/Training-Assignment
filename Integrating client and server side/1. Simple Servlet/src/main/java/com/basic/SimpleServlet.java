package com.basic;

import java.io.IOException;
import javax.servlet.*;

public class SimpleServlet implements Servlet {

	//Life cycle methods:
	ServletConfig conf;
	public void init(ServletConfig conf)
	{
		this.conf=conf;
		System.out.println("creating object ---------->");
		
	}
	
	public void service(ServletRequest req, ServletResponse res)throws ServletException , IOException
	{
		System.out.println("servicing object ---------->");
		
		
	}
	
	public void destroy()
	{
		System.out.println("destroying object ---------->");
	}
	
	//non Life cycle methods:
	
	public ServletConfig getServletConfig()
	{
		return this.conf;
	}
	
	public String getServletInfo()
	{
		return "this is created by me";
	}
	
	
}