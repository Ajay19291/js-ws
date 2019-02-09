package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the party_master database table.
 * 
 */
@Entity
@Table(name="party_master")
@NamedQuery(name="PartyMaster.findAll", query="SELECT p FROM PartyMaster p")
public class PartyMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pkpartyid;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	@Temporal(TemporalType.DATE)
	private Date establishdate;

	private String isactive;

	@Lob
	private String mission;

	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	@Lob
	private String partydesc;

	private String partylogo;

	private String partyname;

	@Lob
	private String vision;

	public PartyMaster() {
	}

	public Long getPkpartyid() {
		return this.pkpartyid;
	}

	public void setPkpartyid(Long pkpartyid) {
		this.pkpartyid = pkpartyid;
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

	public Date getEstablishdate() {
		return this.establishdate;
	}

	public void setEstablishdate(Date establishdate) {
		this.establishdate = establishdate;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getMission() {
		return this.mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
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

	public String getPartydesc() {
		return this.partydesc;
	}

	public void setPartydesc(String partydesc) {
		this.partydesc = partydesc;
	}

	public String getPartylogo() {
		return this.partylogo;
	}

	public void setPartylogo(String partylogo) {
		this.partylogo = partylogo;
	}

	public String getPartyname() {
		return this.partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String getVision() {
		return this.vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

}