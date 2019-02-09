package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the country_master database table.
 * 
 */
@Entity
@Table(name="country_master")
@NamedQuery(name="CountryMaster.findAll", query="SELECT c FROM CountryMaster c")
@JsonIgnoreProperties(value = {"createddate", "modifieddate","stateMasters"}, 
allowGetters = true)
public class CountryMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pkcountryid;

	private String countryname;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	private String isactive;

	private BigInteger modfiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	//bi-directional many-to-one association to StateMaster
	@OneToMany(fetch=FetchType.LAZY,mappedBy="countryMaster")
	private List<StateMaster> stateMasters;

	public CountryMaster() {
	}

	public Long getPkcountryid() {
		return this.pkcountryid;
	}

	public void setPkcountryid(Long pkcountryid) {
		this.pkcountryid = pkcountryid;
	}

	public String getCountryname() {
		return this.countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
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

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public BigInteger getModfiedby() {
		return this.modfiedby;
	}

	public void setModfiedby(BigInteger modfiedby) {
		this.modfiedby = modfiedby;
	}

	public Date getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	public List<StateMaster> getStateMasters() {
		return this.stateMasters;
	}

	public void setStateMasters(List<StateMaster> stateMasters) {
		this.stateMasters = stateMasters;
	}

	public StateMaster addStateMaster(StateMaster stateMaster) {
		getStateMasters().add(stateMaster);
		stateMaster.setCountryMaster(this);

		return stateMaster;
	}

	public StateMaster removeStateMaster(StateMaster stateMaster) {
		getStateMasters().remove(stateMaster);
		stateMaster.setCountryMaster(null);

		return stateMaster;
	}

}