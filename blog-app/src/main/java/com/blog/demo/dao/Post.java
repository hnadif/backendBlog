package com.blog.demo.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@JsonIgnoreProperties(value = {"comments","hibernateLazyInitializer", "handler"})
public class Post implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	@Lob
	private String text;
	private String image;
	@Temporal(TemporalType.DATE)
	private Date date;

	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	@OneToMany(mappedBy = "post", fetch = FetchType.LAZY, orphanRemoval = true)
	private List<PostComment> postComments = new ArrayList<PostComment>();

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	   //Add postComment
		public void addPostComment(PostComment postComment) {
			this.postComments.add(postComment);
			postComment.setPost(this);
		}
		
		//Remove postComment
		public void removePostComment(PostComment postComment) {
			this.postComments.remove(postComment);
			postComment.setPost(null);
		}


	public Post(String title, String text, String image, Date date) {
		super();
		this.title = title;
		this.text = text;
		this.image = image;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<PostComment> getComments() {
		return postComments;
	}

	public void setComments(List<PostComment> comments) {
		this.postComments = comments;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", text=" + text + ", image=" + image + ", date=" + date+ "]";
	}
	
	

}
