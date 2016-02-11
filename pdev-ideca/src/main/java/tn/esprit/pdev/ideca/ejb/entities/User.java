package tn.esprit.pdev.ideca.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name="t_user")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

	@Id
	private Integer idUser;
	private String login;
	private String password;
	private String email;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	public Integer getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
   
}
