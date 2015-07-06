package controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReportsDao;
import dao.ReportsDoaImpl;

/**
 * Servlet implementation class ReportsServlet
 */
@WebServlet("/Reports")
public class ReportsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map map = request.getParameterMap();
		int count = 1;
		
		for (Object key : map.keySet()) {
			if (count == map.size())
				break;
			ReportsDao reportsDao = new ReportsDoaImpl();
			reportsDao.updateReportStatus(Integer.parseInt(key.toString()), request.getParameter(key.toString()));
			count++;
		}
		
		response.sendRedirect("reviewReports.jsp");
	}

}
