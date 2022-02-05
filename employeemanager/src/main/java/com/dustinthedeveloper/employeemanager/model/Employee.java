package com.dustinthedeveloper.employeemanager.model;

import java.io.Serializable;
import javax.persistence.*;

	//@Entity is used to allow this class to be mapped to a database table and we have access to this 
	//annotation and functionality through JPA persistence
@Entity 
public class Employee implements Serializable{
	// implementing Serializable to allow for conversion of this class to a static stream of bytes,
	//which we can then save to a database or transfer over a network.
	
	@Id  //used to define which attribute will be used as the primary key on the database
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //used to tell JPA persistence HOW to generate the Primary Key
	@Column(nullable = false, updatable = false)	//used to tell JPA how to treat the column, in this case an Id HAS to 
													//exist (can't be nullable) and once created it can't be updated
	private Long id;
	private String name;
	private String email;
	private String jobTitle;
	private String phone;
	private String imageUrl;
	private String employeeCode;
	
	
	
	public Employee() {}
	
	public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode) {
		this.name = name;
		this.email = email;
		this.jobTitle = jobTitle;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.employeeCode = employeeCode;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	
	@Override
	public String toString() {
		return " Employee{" + 
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", jobTitle='" + jobTitle + '\'' +
				", phone='" + phone + '\'' +
				", imageUrl='" + imageUrl + '\'' +
				'}';
	}
}



