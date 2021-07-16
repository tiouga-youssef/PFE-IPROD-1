package com.incidents.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="users")
public class UserEntity implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 999861692305194974L;
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
 
	private long id; 

	private String UserId;
	@Column(length=255,nullable=false) 
	private String firstName;
	@Column(length=50,nullable=false)
	private String lastName;
	@Column(length=50,nullable=false)
	private String email;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	private String encryptedPassword;

	
	
	
	
}
