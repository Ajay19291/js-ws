package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the question_category database table.
 * 
 */
@Entity
@Table(name="question_category")
@NamedQuery(name="QuestionCategory.findAll", query="SELECT q FROM QuestionCategory q")
public class QuestionCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pkquestioncategoryid;

	private String categorydescription;

	private String categoryname;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	private String isactive;

	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	public QuestionCategory() {
	}

	public Long getPkquestioncategoryid() {
		return this.pkquestioncategoryid;
	}

	public void setPkquestioncategoryid(Long pkquestioncategoryid) {
		this.pkquestioncategoryid = pkquestioncategoryid;
	}

	public String getCategorydescription() {
		return this.categorydescription;
	}

	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}

	public String getCategoryname() {
		return this.categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
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

}