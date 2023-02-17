package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(name="fName" ,nullable=false)
private String fName;
	@Column(name="address")
private String address;
	@Column(name="city")
private String city;
	@Column(name="country")
private String country;
	
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String fName, String address, String city, String country) {
		super();
		this.id = id;
		this.fName = fName;
		this.address = address;
		this.city = city;
		this.country = country;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Object getFName() {
		// TODO Auto-generated method stub
		return fName;
	}
	
}


