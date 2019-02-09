package com.jandarbar.ws.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the assemblyconstituencies database table.
 * 
 */
@Entity
@Table(name="assemblyconstituencies")
public class Assemblyconstituency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pkassemblyconstituencyid;

	private String assemblyconstituencyname;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;

	private BigInteger fkdistrictid;

	private BigInteger fkparliamentryconstituencyid;

	private BigInteger fkstateid;

	private String isactive;

	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifieddate;

	private int sequenceno;

	public Assemblyconstituency() {
	}

	public Long getPkassemblyconstituencyid() {
		return this.pkassemblyconstituencyid;
	}

	public void setPkassemblyconstituencyid(Long pkassemblyconstituencyid) {
		this.pkassemblyconstituencyid = pkassemblyconstituencyid;
	}

	public String getAssemblyconstituencyname() {
		return this.assemblyconstituencyname;
	}

	public void setAssemblyconstituencyname(String assemblyconstituencyname) {
		this.assemblyconstituencyname = assemblyconstituencyname;
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

	public int getSequenceno() {
		return this.sequenceno;
	}

	public void setSequenceno(int sequenceno) {
		this.sequenceno = sequenceno;
	}

}