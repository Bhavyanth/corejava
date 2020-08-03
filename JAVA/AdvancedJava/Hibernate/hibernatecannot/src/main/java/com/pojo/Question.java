package com.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity  
	@Table(name="q5993")  
	public class Question {    
	  
	@Id   
	@GeneratedValue
	private int qid;    
	private String qname;    
	  
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name = "qaid", referencedColumnName="qid")
	private Set<Answer> answers;  
	public int getId() {  
	    return qid;  
	}  
	public void setId(int id) {  
	    this.qid = id;  
	}  
	public String getQname() {  
	    return qname;  
	}  
	public void setQname(String qname) {  
	    this.qname = qname;  
	}
	public Set<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}  
	    

}
