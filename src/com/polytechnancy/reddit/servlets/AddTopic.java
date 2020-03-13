package com.polytechnancy.reddit.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.polytechnancy.reddit.resources.Topic;
import com.polytechnancy.reddit.resources.TopicDAO;

/**
 * Servlet implementation class AddTask
 */
@WebServlet("/AddTopic")
public class AddTopic extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private TopicDAO topicDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTopic() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String url = "welcome";	
		String topicId = request.getParameter("topicId");
		
		HttpSession session = request.getSession();
		doPost(request, response);
		/*
			It's up to you
		*/
	}

}