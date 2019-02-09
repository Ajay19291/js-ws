package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the question_answers database table.
 * 
 */
@Entity
@Table(name="question_answers")
@JsonIgnoreProperties({"createddate","isactive","modifiedby","modifieddate","createdby","createddate","isdeleted"})

public class QuestionAnswer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pkquestionanswerid;

	@Lob
	private String answer;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	private BigInteger fkquestionid;

	private String isactive;

	private String iscorrect;

	private String isdeleted;

	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	private int sequenceno;

	public QuestionAnswer() {
	}

	public Long getPkquestionanswerid() {
		return this.pkquestionanswerid;
	}

	public void setPkquestionanswerid(Long pkquestionanswerid) {
		this.pkquestionanswerid = pkquestionanswerid;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
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

	public String getIscorrect() {
		return this.iscorrect;
	}

	public void setIscorrect(String iscorrect) {
		this.iscorrect = iscorrect;
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

	public int getSequenceno() {
		return this.sequenceno;
	}

	public void setSequenceno(int sequenceno) {
		this.sequenceno = sequenceno;
	}

}