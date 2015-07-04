package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.POILocation;
import model.POIType;
import model.PointOfInterest;

public class PointOfInterestDaoImpl implements PointOfInterestDao {

	public EntityManager getMyWayEntityManager() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("myway");
		return emf.createEntityManager();
	}

	public List<POIType> getPOITypes() {

		EntityManager em = this.getMyWayEntityManager();
		Query q = em.createNamedQuery("getPoiTypes");
		List<POIType> poiTypes = q.getResultList();
		return poiTypes;
	}

	public void submitPOI(PointOfInterest poi, POILocation location) {

		EntityManager em = this.getMyWayEntityManager();

		em.getTransaction().begin();
		em.persist(location);
		em.persist(poi);
		em.getTransaction().commit();

	}

}
