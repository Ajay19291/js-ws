package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the candidate_info database table.
 * 
 */
@Entity
@Table(name="candidate_info")
@JsonIgnoreProperties({"createdby","createddate","isactive","isdeleted","modifiedby","modifieddate"})
public class CandidateInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty(value="id")
	private Long pkcandidateid;

	@Lob
	private String address;

	private String contactno;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	@Temporal(TemporalType.DATE)
	private Date dateofbirth;

	private String emailid;

	private String firstname;

	private BigInteger fkassemblyconstituencyid;

	private BigInteger fkdistrictid;

	private BigInteger fkparliamentryconstituencyid;

	private BigInteger fkuserid;

	private String gender;

	private String isactive;

	private String isdeleted;

	private String lastname;

	private String middlename;

	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	private int noofcriminalcases;

	private String profilephoto;

	private String questionanswermedium;
	
	private String password;
	
	private String type;

	public CandidateInfo() {
	}

	public Long getPkcandidateid() {
		return this.pkcandidateid;
	}

	public void setPkcandidateid(Long pkcandidateid) {
		this.pkcandidateid = pkcandidateid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactno() {
		return this.contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
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

	public Date getDateofbirth() {
		return this.dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
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

	public BigInteger getFkassemblyconstituencyid() {
		return this.fkassemblyconstituencyid;
	}

	public void setFkassemblyconstituencyid(BigInteger fkassemblyconstituencyid) {
		this.fkassemblyconstituencyid = fkassemblyconstituencyid;
	}

	public BigInteger getFkdistrictid() {
		return this.fkdistrictid;
	}

	public void setFkdistrictid(BigInteger fkdistrictid) {
		this.fkdistrictid = fkdistrictid;
	}

	public BigInteger getFkparliamentryconstituencyid() {
		return this.fkparliamentryconstituencyid;
	}

	public void setFkparliamentryconstituencyid(BigInteger fkparliamentryconstituencyid) {
		this.fkparliamentryconstituencyid = fkparliamentryconstituencyid;
	}

	public BigInteger getFkuserid() {
		return this.fkuserid;
	}

	public void setFkuserid(BigInteger fkuserid) {
		this.fkuserid = fkuserid;
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

	public String getIsdeleted() {
		return this.isdeleted;
	}

	public void setIsdeleted(String isdeleted) {
		this.isdeleted = isdeleted;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
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

	public int getNoofcriminalcases() {
		return this.noofcriminalcases;
	}

	public void setNoofcriminalcases(int noofcriminalcases) {
		this.noofcriminalcases = noofcriminalcases;
	}

	public String getProfilephoto() {
		return this.profilephoto;
	}

	public void setProfilephoto(String profilephoto) {
		this.profilephoto = profilephoto;
	}

	public String getQuestionanswermedium() {
		return this.questionanswermedium;
	}

	public void setQuestionanswermedium(String questionanswermedium) {
		this.questionanswermedium = questionanswermedium;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}