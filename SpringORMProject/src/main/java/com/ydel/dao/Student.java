package com.ydel.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud_tab")
public class Student {
	@Id
	@Column(name="stud_id")
	private int studeId;
	@Column(name="stud_name")
	private String studName;
	@Column(name="stud_fees")
	private float studFees;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studeId, String studName, float studFees) {
		super();
		this.studeId = studeId;
		this.studName = studName;
		this.studFees = studFees;
	}
	public int getStudeId() {
		return studeId;
	}
	public void setStudeId(int studeId) {
		this.studeId = studeId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public float getStudFees() {
		return studFees;
	}
	public void setStudFees(float studFees) {
		this.studFees = studFees;
	}
	
	

}
