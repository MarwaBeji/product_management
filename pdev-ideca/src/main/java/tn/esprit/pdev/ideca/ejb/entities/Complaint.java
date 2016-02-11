package tn.esprit.pdev.ideca.ejb.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import tn.esprit.pdev.ideca.ejb.entities.Trader;

/**
 * Entity implementation class for Entity: Complaint
 *
 */
@Entity
@Table(name="t_complaint")

public class Complaint implements Serializable {

	@Id
	private Integer idComplaint;
	private String subject;
	private String text;
	private Date date;
	private Trader trader;
	private static final long serialVersionUID = 1L;

	public Complaint() {
		super();
	}   
	public Integer getIdComplaint() {
		return idComplaint;
	}
	public void setIdComplaint(Integer idComplaint) {
		this.idComplaint = idComplaint;
	}
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}   
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}   
	public Trader getTrader() {
		return this.trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}
   
}
