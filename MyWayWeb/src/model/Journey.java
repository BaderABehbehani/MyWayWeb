package model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamedQueries(@NamedQuery(name="getJourneyDetails",query="select u from parent u where u.userName = :name"))
@Entity
public class Journey {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String CurrentLocation;
	private int speed;
	private String FinalDestination;
	private float speedAverage;
	private String stops;
	@ManyToOne
	@JoinColumn(name="userId")
	parent p ;
	@Transient
	String username;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCurrentLocation() {
		return CurrentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		CurrentLocation = currentLocation;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getFinalDestination() {
		return FinalDestination;
	}
	public void setFinalDestination(String finalDestination) {
		FinalDestination = finalDestination;
	}
	public float getSpeedAverage() {
		return speedAverage;
	}
	public void setSpeedAverage(float speedAverage) {
		this.speedAverage = speedAverage;
	}
	public String getStops() {
		return stops;
	}
	public void setStops(String stops) {
		this.stops = stops;
	}
	public parent getP() {
		return p;
	}
	public void setP(parent p) {
		this.p = p;
		username=p.getUserName();
	}

}
