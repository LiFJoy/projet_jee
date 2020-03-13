package com.polytechnancy.reddit.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.polytechnancy.reddit.resources.TopicDAO;

/**
 * Servlet implementation class TaskDone
 */
@WebServlet("/TopicDone")
public class TopicDone extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private TopicDAO topicDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TopicDone() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String url = "welcome";
		String topicId = request.getParameter("topicId");
		int id;
		
		try {
			
			/*
				It's up to you
			*/
			
			
		} catch (NumberFormatException e) {
			System.err.println("Invalid Id");
		}
		finally {
			response.sendRedirect(url);
		}
		
		
	}

}
