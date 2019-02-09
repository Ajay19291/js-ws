package com.jandarbar.ws.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table (name="candidate_posts")

public class CandidatePosts 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	private Long candidatePostId;
	
	@JsonProperty("candidateId")
	private Long fkcandidateId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date publishDate;
	
	@Lob
	private String postContent;
	
	private String postImageName;
	
	private String postVideoName;
	
	private String youtubeVideoLink;
	
	private Long likes;
	
	

	public Long getCandidatePostId() {
		return candidatePostId;
	}

	public void setCandidatePostId(Long candidatePostId) {
		this.candidatePostId = candidatePostId;
	}

	public Long getFkcandidateId() {
		return fkcandidateId;
	}

	public void setFkcandidateId(Long fkcandidateId) {
		this.fkcandidateId = fkcandidateId;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostImageName() {
		return postImageName;
	}

	public void setPostImageName(String postImageName) {
		this.postImageName = postImageName;
	}

	public String getPostVideoName() {
		return postVideoName;
	}

	public void setPostVideoName(String postVideoName) {
		this.postVideoName = postVideoName;
	}

	public String getYoutubeVideoLink() {
		return youtubeVideoLink;
	}

	public void setYoutubeVideoLink(String youtubeVideoLink) {
		this.youtubeVideoLink = youtubeVideoLink;
	}

	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}
	
	

}
