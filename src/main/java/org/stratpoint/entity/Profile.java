package org.stratpoint.entity;

import java.util.Date;

/*
 * Entity Class for Profile
 * contains elements for Profile
 */
public class Profile {
	private String id;
	private Boolean active;
	private Boolean blocked;
	private String balance;
	private String picture;
	private Integer age;
	private Name name;
	private String email;
	private String phone;
	private String address;
	private String profile;
	private Date dateRegistered;
	
	/*
	 * Getter and Setters
	 */
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Boolean getActive() {
		return active;
	}
	
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	public Boolean getBlocked() {
		return blocked;
	}
	
	public void setBlocked(Boolean blocked) {
		this.blocked = blocked;
	}
	
	public String getBalance() {
		return balance;
	}
	
	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getProfile() {
		return profile;
	}
	
	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Date getDateRegistered() {
		return dateRegistered;
	}

	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

	/*
	 * (non-Javadoc)
	 * Returns String format of all elements on this class
	 * 
	 * This method overrides toString() method with our custom String format for this class
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User{" +
				"id=" + id + 
				", active=" + active +
				", blocked=" + blocked + 
				", balance='" + balance + '\'' +
				", age=" + age + 
				", name=" + name + 			
				", email='" + email + '\'' +		
				", phone='" + phone + '\'' +		
				", address='" + address + '\'' +		
				", profile='" + profile + '\'' +
				", date_registered=" + dateRegistered + 
				'}';
	}
}
