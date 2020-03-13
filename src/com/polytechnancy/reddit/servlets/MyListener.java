package com.polytechnancy.reddit.servlets;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class MyListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		session.setMaxInactiveInterval(60);
		System.out.println("Session créée");
	}
	
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("Session détruite");
	}
}
