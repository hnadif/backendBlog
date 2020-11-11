package com.blog.demo.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class PostComment implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String review;

	@ManyToOne(fetch = FetchType.LAZY)
	private Post post;

	@Override
	public String toString() {
		return "PostComment [id=" + id + ", review=" + review + "]";
	}

	public PostComment() {
		super();
	}

	public PostComment(String review, Post post) {
		super();
		this.review = review;
		this.post = post;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof PostComment))
			return false;
		return id != null && this.equals((PostComment) o);
	}

	@Override
	public int hashCode() {
		return 31;
	}

}
