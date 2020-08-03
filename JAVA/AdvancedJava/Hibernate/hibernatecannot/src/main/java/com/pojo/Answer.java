package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ans5993")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	private String answername;
	private String postedBy;

	public int getId() {
		return aid;
	}

	public void setId(int id) {
		this.aid = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

}
