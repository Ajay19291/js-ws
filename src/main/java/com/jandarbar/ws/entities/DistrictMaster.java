package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the district_master database table.
 * 
 */
@Entity
@Table(name="district_master")
@NamedQuery(name="DistrictMaster.findAll", query="SELECT d FROM DistrictMaster d")
public class DistrictMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	private Long pkdistrictid;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	private String districtname;

	private BigInteger fkstateid;

	private String isactive;

	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	public DistrictMaster() {
	}

	public Long getPkdistrictid() {
		return this.pkdistrictid;
	}

	public void setPkdistrictid(Long pkdistrictid) {
		this.pkdistrictid = pkdistrictid;
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

	public String getDistrictname() {
		return this.districtname;
	}

	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}

	public BigInteger getFkstateid() {
		return this.fkstateid;
	}

	public void setFkstateid(BigInteger fkstateid) {
		this.fkstateid = fkstateid;
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

}