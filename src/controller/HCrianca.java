package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Crianca;
import service.SCrianca;

/**
 * Servlet implementation class HCrianca
 */
@WebServlet("/HCrianca")
public class HCrianca extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SCrianca servCrianca;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public HCrianca() {
        super();

        this.servCrianca = new SCrianca();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("listaCrianca", servCrianca.getArCrianca());
		
		request.getRequestDispatcher("crianca.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Crianca c = new Crianca(
								servCrianca.getArCrianca().size(), 
								request.getParameter("c_nome"), 
								request.getParameter("c_dataNascimento"), 
								request.getParameter("c_ccidadao"),
								request.getParameter("c_observacoes"));
		
		servCrianca.getArCrianca().add(c);
		
		this.doGet(request, response);
	}

}
