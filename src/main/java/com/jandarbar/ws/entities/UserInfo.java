package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the user_info database table.
 * 
 */
@Entity
@Table(name="user_info")
@JsonIgnoreProperties({"password","fkdistrictid","gender","mobilenumber","modifiedby","modifieddate","createdby","createddate","isactive"})
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty(value="id")
	private Long pkuserid;

	private String address;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	private String emailid;

	private String firstname;

	@JsonIgnoreProperties(value="districtId")
	private BigInteger fkdistrictid;

	private String gender;

	private String isactive;

	private String lastname;

	private BigInteger mobilenumber;

	private BigInteger modifiedby;
	
	private String password;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	private String type;

	private String username;

	public UserInfo() {
	}

	public Long getPkuserid() {
		return this.pkuserid;
	}

	public void setPkuserid(Long pkuserid) {
		this.pkuserid = pkuserid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigInteger getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigInteger createdby) {
		this.createdby = createdby;
	}

	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public BigInteger getFkdistrictid() {
		return this.fkdistrictid;
	}

	public void setFkdistrictid(BigInteger fkdistrictid) {
		this.fkdistrictid = fkdistrictid;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public BigInteger getMobilenumber() {
		return this.mobilenumber;
	}

	public void setMobilenumber(BigInteger mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public BigInteger getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(BigInteger modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}