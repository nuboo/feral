package com.example.model;

public class CourseClassInfo {
      public int getClassIcon() {
		return classIcon;
	}
	public void setClassIcon(int classIcon) {
		this.classIcon = classIcon;
	}
	public String getClassTitle() {
		return classTitle;
	}
	public void setClassTitle(String classTitle) {
		this.classTitle = classTitle;
	}
	public String getClassPeople() {
		return classPeople;
	}
	public void setClassPeople(String classPeople) {
		this.classPeople = classPeople;
	}
	public String getClassSource() {
		return classSource;
	}
	public void setClassSource(String classSource) {
		this.classSource = classSource;
	}
	public String getClassArticle() {
		return classArticle;
	}
	public void setClassArticle(String classArticle) {
		this.classArticle = classArticle;
	}
	public String getClassGrade() {
		return classGrade;
	}
	public void setClassGrade(String classGrade) {
		this.classGrade = classGrade;
	}
	public String getClassEndTime() {
		return classEndTime;
	}
	public void setClassEndTime(String classEndTime) {
		this.classEndTime = classEndTime;
	}
	int classIcon;//图标
      String classTitle;//课程标题
      String classPeople;//课程报名人数
      String classSource;//课程培训方
      String classArticle;//课程方向
      String classGrade;//等级
      String classEndTime;//报名截止剩余时间
      
}
