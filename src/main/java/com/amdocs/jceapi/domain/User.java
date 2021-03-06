package com.amdocs.jceapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_account")
public class User {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private Long id;

	@Column(name = "first_name", length = 50)
	private String firstName;

	@Column(name="last_name", length = 50)
	private String lastName;
	
	@Column(name="middle_name", length = 50)
	private String middleName;
	
	@Column(name="user_type")
	private String userType;
	
	@Column(name="phone_number", length = 15)
	private String phoneNumber;
	
	@Column(name="country_code", length = 5)
	private String countryCode;
	
	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idaddress", name="idaddress", unique=false, nullable=true, updatable=false)
	private Address address;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
