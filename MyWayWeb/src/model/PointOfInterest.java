package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class PointOfInterest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String namePOI;
	private String description;
	private char status='P';//default value P > Pending
	@ManyToOne
	private POIType poiType;
	
	
	public PointOfInterest() {
		super();
	}
	
	public PointOfInterest(String namePOI, String description,
			POIType poiType) {
		super();
		this.namePOI = namePOI;
		this.description = description;
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

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
		
}
