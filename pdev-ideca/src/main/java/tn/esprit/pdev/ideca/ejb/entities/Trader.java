package tn.esprit.pdev.ideca.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import tn.esprit.pdev.ideca.ejb.entities.User;

/**
 * Entity implementation class for Entity: Trader
 *
 */
@Entity

public class Trader extends User implements Serializable {

	
	private String firstName;
	private String lastName;
	private String address;
	private String company;
	private String job;
	private Date birthDate;
	private Integer cin;
	private Integer limit;
	private Integer creditCard;
	private String nationality;
	private String phoneNumber;
	private static final long serialVersionUID = 1L;

	public Trader() {
		super();
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}   
	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}   
	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}   
	public Integer getCin() {
		return this.cin;
	}

	public void setCin(Integer cin) {
		this.cin = cin;
	}   
	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}   
	public Integer getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(Integer creditCard) {
		this.creditCard = creditCard;
	}   
	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}   
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
   
}
