
package com.jpa.employee.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employee_table")
public class Employee
{

	@Id
	@Column(name="employee_id")
	@GenericGenerator(name="empid_generator",strategy="com.jpa.employee.sequencegenerator.SequenceGenerator")
	@GeneratedValue(generator ="empid_generator")
	private String id;
	
	@Column(name="first_name" ,length=60,nullable=false)
	private String firstName;
	
	@Column(name="last_name", length=60,nullable=false)
	private String lastName;
	
	@Column(name="employee_email_id",unique=true) 
	private String email;
	
	@Column(name="employee_creation_date")
	@Temporal(TemporalType.DATE)
	private Date creationDate;

	public Employee() {
		super();
	
	}

	public Employee(String firstName, String lastName, String email, Date creationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.creationDate = creationDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", creationDate=" + creationDate + "]";
	}
	
	

}

