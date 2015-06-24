package acdemic.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4735625644569005071L;
	@Id
	@Column(name="cid")
	private int id;
	private String uid;
	@Column(name="cname")
	private String courseName;
	@Column(name="score")
	private int score;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getUid(){
		return uid;
	}
	public void setUid(String uid){
		this.uid=uid;
	}
	public String getCourseName(){
		return courseName;
	}
	public void setCourseName(String courseName){
		this.courseName=courseName;
	}
	public int getScore(){
		return score;
	}
	public void setScore(int score){
		this.score=score;
	}
}
