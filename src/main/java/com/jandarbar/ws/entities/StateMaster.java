package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the state_master database table.
 * 
 */
@Entity
@Table(name="state_master")
@NamedQuery(name="StateMaster.findAll", query="SELECT s FROM StateMaster s")
@JsonIgnoreProperties("countryMaster")
public class StateMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pkstateid;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	private String isactive;

	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	private String statename;

	//bi-directional many-to-one association to CountryMaster
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fkcountryid")
	private CountryMaster countryMaster;

	public StateMaster() {
	}

	public Long getPkstateid() {
		return this.pkstateid;
	}

	public void setPkstateid(Long pkstateid) {
		this.pkstateid = pkstateid;
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

	public String getStatename() {
		return this.statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public CountryMaster getCountryMaster() {
		return this.countryMaster;
	}

	public void setCountryMaster(CountryMaster countryMaster) {
		this.countryMaster = countryMaster;
	}

}