package com.incidents.dto;

import java.io.Serializable;

public class UserDto implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8469154729629619489L; 

	private long id;
	private String user_id; 
	private String first_name;
	private String last_name;
	private String email;
	private String encrypted_password; 

	public UserDto(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
	}
	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return user_id;
	}
	public void setUserId(String userId) {
		user_id = userId;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String lastName) {
		this.last_name = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEncryptedPassword() {
		return encrypted_password;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encrypted_password = encryptedPassword;
	}

	
	
}
