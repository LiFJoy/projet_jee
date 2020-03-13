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


/**
 * Servlet Filter implementation class IPFilter
 */
@WebFilter("/")
public class IPFilter implements Filter {
	
	FilterConfig fconfig;

    /**
     * Default constructor. 
     */
    public IPFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String ip = request.getRemoteHost();
		fconfig.getServletContext().log("IP:"+ip);
		FileWriter writer = new FileWriter("path'/IPlog",true);
		PrintWriter mywriter = new PrintWriter(writer);
		mywriter.println("IP:"+ip);
		writer.close();
		chain.doFilter(request, response);
	}

}
