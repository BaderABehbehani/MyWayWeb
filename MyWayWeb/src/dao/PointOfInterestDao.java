package dao;

import java.util.List;

import model.POILocation;
import model.POIType;
import model.PointOfInterest;

public interface PointOfInterestDao {
	
	List<POIType> getPOITypes();

	void submitPOI(PointOfInterest poi, POILocation location);
}
