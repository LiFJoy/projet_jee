package com.polytechnancy.reddit.servlets;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.polytechnancy.reddit.resources.Topic;
import com.polytechnancy.reddit.resources.TopicDAO;


/**
 * Servlet implementation class Welcome
 */
@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	@Inject
	private TopicDAO topicDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String url = "/WEB-INF/index.jsp";
		List<Topic> topics = topicDAO.findAll();
		request.setAttribute("topics", topics);

		getServletContext()
		.getRequestDispatcher(url).
		forward(request, response);
	}



}