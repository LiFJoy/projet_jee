package com.polytechnancy.reddit.servlets;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;



/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MyListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    @Override
	public void sessionCreated(HttpSessionEvent se)  { 
         HttpSession session = se.getSession();
         session.setMaxInactiveInterval(60);
         System.out.println("Session creee");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
}