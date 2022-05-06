package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ValueGenerationType;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	private String namString;
	
	private String emailString;
	
	private String passString;
	
	private String addString;
	
	private String numString;
	
	private String courseString;

	private String genderString;
	
	@Transient
	private String checkedString;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNamString() {
		return namString;
	}
	public void setNamString(String namString) {
		this.namString = namString;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	public String getPassString() {
		return passString;
	}
	public void setPassString(String passString) {
		this.passString = passString;
	}
	public String getAddString() {
		return addString;
	}
	public void setAddString(String addString) {
		this.addString = addString;
	}
	public String getNumString() {
		return numString;
	}
	public void setNumString(String numString) {
		this.numString = numString;
	}
	public String getCourseString() {
		return courseString;
	}
	public void setCourseString(String courseString) {
		this.courseString = courseString;
	}
	public String getGenderString() {
		return genderString;
	}
	public void setGenderString(String genderString) {
		this.genderString = genderString;
	}
	public String getCheckedString() {
		return checkedString;
	}
	public void setCheckedString(String checkedString) {
		this.checkedString = checkedString;
	}
	public Student(Integer id, String namString, String emailString, String passString, String addString,
			String numString, String courseString, String genderString, String checkedString) {
		super();
		this.id = id;
		this.namString = namString;
		this.emailString = emailString;
		this.passString = passString;
		this.addString = addString;
		this.numString = numString;
		this.courseString = courseString;
		this.genderString = genderString;
		this.checkedString = checkedString;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", namString=" + namString + ", emailString=" + emailString + ", passString="
				+ passString + ", addString=" + addString + ", numString=" + numString + ", courseString="
				+ courseString + ", genderString=" + genderString + ", checkedString=" + checkedString + "]";
	}
	
	
}
