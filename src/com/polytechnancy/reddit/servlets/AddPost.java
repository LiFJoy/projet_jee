package com.polytechnancy.reddit.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.polytechnancy.reddit.ressources.Post;
import com.polytechnancy.reddit.ressources.PostDAO;

/**
 * Servlet implementation class AddPost
 */
@WebServlet("/AddPost")
public class AddPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	@EJB
	private PostDAO postDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "Accueil";
		String titre = request.getParameter("titre");
		
		HttpSession session = request.getSession();
		
		Post post = new Post(titre);
		this.postDAO.add(post);
		
		session.setAttribute("post", post);
		response.sendRedirect(url);
	}

}
