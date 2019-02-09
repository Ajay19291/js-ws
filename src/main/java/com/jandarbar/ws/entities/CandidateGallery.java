package com.jandarbar.ws.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="candidate_gallery")
public class CandidateGallery 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty(value="id")
	private Long pkcandidategalleryid;
	
	@JsonProperty("cid")
	private Long fkCandidateId;
	
	private String imageName;
	
	private String videoName;
	
	private Date createdDate;
	
	private String mediaOption;
	
	private Long likes;

	public Long getPkcandidategalleryid() {
		return pkcandidategalleryid;
	}

	public void setPkcandidategalleryid(Long pkcandidategalleryid) {
		this.pkcandidategalleryid = pkcandidategalleryid;
	}

	public Long getFkCandidateId() {
		return fkCandidateId;
	}

	public void setFkCandidateId(Long fkCandidateId) {
		this.fkCandidateId = fkCandidateId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getMediaOption() {
		return mediaOption;
	}

	public void setMediaOption(String mediaOption) {
		this.mediaOption = mediaOption;
	}

	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

}
