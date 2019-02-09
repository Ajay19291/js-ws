package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the candidate_answers database table.
 * 
 */
@Entity
@Table(name="candidate_answers")
@JsonIgnoreProperties({"createddate","isactive","modifiedby","modifieddate","createdby","createddate","isdeleted"})
public class CandidateAnswer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty(value="id")
	private Long pkcandidateanswerid;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	@JsonProperty(value="answerId")
	private BigInteger fkanswerid;

	@JsonProperty(value="candidateId")
	private BigInteger fkcandidateid;

	@JsonProperty(value="questionId")
	private BigInteger fkquestionid;

	private String isactive;

	private String isdeleted;

	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	public CandidateAnswer() {
	}

	public Long getPkcandidateanswerid() {
		return this.pkcandidateanswerid;
	}

	public void setPkcandidateanswerid(Long pkcandidateanswerid) {
		this.pkcandidateanswerid = pkcandidateanswerid;
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

	public BigInteger getFkanswerid() {
		return this.fkanswerid;
	}

	public void setFkanswerid(BigInteger fkanswerid) {
		this.fkanswerid = fkanswerid;
	}

	public BigInteger getFkcandidateid() {
		return this.fkcandidateid;
	}

	public void setFkcandidateid(BigInteger fkcandidateid) {
		this.fkcandidateid = fkcandidateid;
	}

	public BigInteger getFkquestionid() {
		return this.fkquestionid;
	}

	public void setFkquestionid(BigInteger fkquestionid) {
		this.fkquestionid = fkquestionid;
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