package model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class POILocation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int locationID;
	
	private String location;
	
	@OneToMany(mappedBy="locationPOI", cascade=CascadeType.ALL)
	private List<PointOfInterest> pointsOfInterests;

	public int getLocationID() {
		return locationID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
