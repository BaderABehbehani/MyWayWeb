package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;

import model.Journey;
import model.parent;

public class ParentsMonitoringDaoImpl implements ParentsMonitoringDao{
	
	
	public EntityManager getMyWayEntityManager(){
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("myway");
		return emf.createEntityManager();
	}

	@Override
	public List<Journey> getJourneysForParent(String userName) {
		
		List<Journey> journeys = new ArrayList<Journey>();
		
		EntityManager em = this.getMyWayEntityManager();

		try {
			
			Query q = em.createNamedQuery("getUsers");
			
			q.setParameter("name", userName);
			
			List<parent> user = q.getResultList();
			
			em.getTransaction().begin();
			q.getSingleResult();
			em.getTransaction().commit();
			for (int i = 0; i < user.size(); i++) {
				String username = user.get(i).getUserName();

				Query q1 = em.createNamedQuery("getJourneyDetails");
				q1.setParameter("name", username);
				List<parent> details = q1.getResultList();
				// execute query
				em.getTransaction().begin();
				q1.getResultList();
				q1.getResultList();
				em.getTransaction().commit();
				
				journeys =  details.get(i).getJourneies();
				
			}
		} catch (NoResultException e) {
			System.out.println("user does not exist");
		}
		return journeys;
	}
	
	

}
