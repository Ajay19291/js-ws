package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the question_master database table.
 * 
 */
@Entity
@Table(name="question_master")
@JsonIgnoreProperties({"createddate","isactive","modifiedby","modifieddate","createdby","createddate"})
public class QuestionMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pkquestionid;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	private BigInteger fkquestioncategoryid;

	private String isactive;

	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	@Lob
	private String question;

	public QuestionMaster() {
	}

	public Long getPkquestionid() {
		return this.pkquestionid;
	}

	public void setPkquestionid(Long pkquestionid) {
		this.pkquestionid = pkquestionid;
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

	public BigInteger getFkquestioncategoryid() {
		return this.fkquestioncategoryid;
	}

	public void setFkquestioncategoryid(BigInteger fkquestioncategoryid) {
		this.fkquestioncategoryid = fkquestioncategoryid;
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

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}