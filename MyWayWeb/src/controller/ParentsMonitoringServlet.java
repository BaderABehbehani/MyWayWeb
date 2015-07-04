package controller;

/*
 * this servlet file works as a resource for REST  
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;

import dao.ParentsMonitoringDao;
import dao.ParentsMonitoringDaoImpl;
import model.Journey;
import model.parent;

@WebServlet("/ParentsMonitoring")
public class ParentsMonitoringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ParentsMonitoringServlet() {
		super();
	}

	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.println(PrintJourneys());
		out.close();
		return;

	}

	private String PrintJourneys() {

		ParentsMonitoringDao parentsMonitoringDao = new ParentsMonitoringDaoImpl();
		// create array of type JASON
		JSONArray jsonDetailsArray = new JSONArray();
		List<Journey> journeys = parentsMonitoringDao
				.getJourneysForParent("hebah");
		for (Journey journey : journeys) {
			JSONObject jsonDetails = new JSONObject();
			// print for debugging
			System.out.println("User ID is " + journey.getId());
			System.out.println("The Current Location is "
					+ journey.getCurrentLocation());
			System.out.println("The Final Destination is "
					+ journey.getFinalDestination());
			System.out.println("The Speed is " + journey.getSpeed());
			System.out.println("The speedAverage is "
					+ journey.getSpeedAverage());

			jsonDetails.put("Username", "hebah");
			jsonDetails.put("UserID", journey.getId());
			jsonDetails.put("CurrentLocation", journey.getCurrentLocation());
			jsonDetails.put("FinalDestination", journey.getFinalDestination());
			jsonDetails.put("Speed", journey.getSpeed());
			jsonDetails.put("speedAverage", journey.getSpeedAverage());
			jsonDetails.put("stop", journey.getStops());
			jsonDetailsArray.add(jsonDetails);
		}
		System.out.println(jsonDetailsArray.toString());
		return (jsonDetailsArray.toString());
	}

}
