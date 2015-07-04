package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class PointOfInterest {
	@Id
	private String namePOI;
	private String description;
	@ManyToOne
	private POILocation locationPOI;
	private char status='P';//default value P > Pending
	@ManyToOne
	private POIType poiType;
	
	
	public PointOfInterest() {
		super();
	}
	
	public PointOfInterest(String namePOI, String description,
			POILocation locationPOI, POIType poiType) {
		super();
		this.namePOI = namePOI;
		this.description = description;
		this.locationPOI = locationPOI;
		this.poiType = poiType;
	}
	public String getNamePOI() {
		return namePOI;
	}
	public void setNamePOI(String namePOI) {
		this.namePOI = namePOI;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public POILocation getLocationPOI() {
		return locationPOI;
	}
	public void setLocationPOI(POILocation locationPOI) {
		this.locationPOI = locationPOI;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public POIType getPoiType() {
		return poiType;
	}
	public void setPoiType(POIType poiType) {
		this.poiType = poiType;
	}
		
}
