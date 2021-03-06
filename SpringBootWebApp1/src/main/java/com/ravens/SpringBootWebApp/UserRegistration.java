package com.ravens.SpringBootWebApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UID;
	private String UName;
	private String EmailId;
	private String Password;
	private byte Gender;
	private String[] Hobby;
	
	public String getUName() {
		return UName;
	}
	public void setUName(String uNameString) {
		this.UName = uNameString;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		this.EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public byte getGender() {
		return Gender;
	}
	public void setGender(byte gender) {
		this.Gender = gender;
	}
	public String[] getHobby() {
		return Hobby;
	}
	public void setHobby(String[] hobby) {
		this.Hobby = hobby;
	}

}
