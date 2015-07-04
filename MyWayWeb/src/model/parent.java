package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
@NamedQueries(@NamedQuery(name="getUsers",query="select u from parent u where u.userName = :name"))

@Entity
public class parent {
	@Id
	private String userName;
	private String passWord;
	
	
	@OneToMany(mappedBy="p",cascade=CascadeType.ALL)
	List <Journey> journeies= new ArrayList<Journey>() ;
	
	
	public List<Journey> getJourneies() {
		return journeies;
	}
	public void setJourneies(List<Journey> journeies) {
		this.journeies = journeies;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
