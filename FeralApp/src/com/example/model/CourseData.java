package com.example.model;

import java.util.ArrayList;

public class CourseData {
	String type;//类型
	String[] tags;//标签
	ArrayList<School> schools;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public ArrayList<School> getSchools() {
		return schools;
	}
	public void setSchools(ArrayList<School> schools) {
		this.schools = schools;
	}
	

}
