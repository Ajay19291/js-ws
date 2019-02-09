package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the parliamentryconstituencies database table.
 * 
 */
@Entity
@Table(name="parliamentryconstituencies")
@NamedQuery(name="Parliamentryconstituency.findAll", query="SELECT p FROM Parliamentryconstituency p")
public class Parliamentryconstituency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pkparliamentryconstituencyid;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	@Lob
	private String description;

	private BigInteger fkdistrictid;

	private BigInteger fkstateid;

	private String isactive;

	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	private String parliamentryconstituencyname;

	private int sequenceno;

	public Parliamentryconstituency() {
	}

	public Long getPkparliamentryconstituencyid() {
		return this.pkparliamentryconstituencyid;
	}

	public void setPkparliamentryconstituencyid(Long pkparliamentryconstituencyid) {
		this.pkparliamentryconstituencyid = pkparliamentryconstituencyid;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigInteger getFkdistrictid() {
		return this.fkdistrictid;
	}

	public void setFkdistrictid(BigInteger fkdistrictid) {
		this.fkdistrictid = fkdistrictid;
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

	public String getParliamentryconstituencyname() {
		return this.parliamentryconstituencyname;
	}

	public void setParliamentryconstituencyname(String parliamentryconstituencyname) {
		this.parliamentryconstituencyname = parliamentryconstituencyname;
	}

	public int getSequenceno() {
		return this.sequenceno;
	}

	public void setSequenceno(int sequenceno) {
		this.sequenceno = sequenceno;
	}

}