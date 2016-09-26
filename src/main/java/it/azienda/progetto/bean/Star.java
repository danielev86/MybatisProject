package it.azienda.progetto.bean;

import java.io.Serializable;
import java.util.Date;

public class Star implements Serializable {

	private Integer id;
	private String firstName;
	private String lastName;
	private Date born;
	private String biography;

	public Star() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Star(Integer id, String firstName, String lastName, Date born, String biography) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.born = born;
		this.biography = biography;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBorn() {
		return born;
	}

	public void setBorn(Date born) {
		this.born = born;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	@Override
	public String toString() {
		return "Star [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", born=" + born
				+ ", biography=" + biography + "]";
	}

	
}
