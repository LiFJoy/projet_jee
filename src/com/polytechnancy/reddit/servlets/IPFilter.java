package com.polytechnancy.reddit.servlets;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/")
public class IPFilter implements Filter{
	
	FilterConfig fConfig;
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException{
		
		String ip = request.getRemoteHost();
		fConfig.getServletContext().log("IP:"+ip);
		FileWriter writer=new FileWriter("'path'/lPlog",true);
		PrintWriter mywriter=new PrintWriter(writer);
		mywriter.println("IP:"+ip);
		writer.close();
		chain.doFilter(request, response);
	}
	
}
