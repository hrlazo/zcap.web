package cl.inacap.zCappApp.controllers;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.zCapModel.dao.ConsolaDAOLocal;
import cl.inacap.zCapModel.dto.Consola;

/**
 * Servlet implementation class VerConsolasController
 */
@WebServlet("/VerConsolasController.do")
public class VerConsolasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ConsolaDAOLocal consolasDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerConsolasController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("nombreElminar") !=null) {
			String nombre = request.getParameter("nombreElminar").trim();
			List<Consola> busqueda= consolasDAO.filterByName(nombre);
			Consola consolaAEliminar =busqueda.isEmpty()? null:busqueda.get(0);
			if (consolaAEliminar != null) {
				consolasDAO.delete(consolaAEliminar);
			}
		};
		
		List<Consola> consolas = consolasDAO.getAll();
		request.setAttribute("consolas", consolas);
		request.getRequestDispatcher("WEB-INF/vistas/verConsolas.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
