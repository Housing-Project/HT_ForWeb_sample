package com.ht.model;

public class ProjectPic {
	
	private int projectId;
	private String picName;
	private String picPath;
	private int picStatus;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public int getPicStatus() {
		return picStatus;
	}
	public void setPicStatus(int picStatus) {
		this.picStatus = picStatus;
	}
	@Override
	public String toString() {
		return "ProjectPic [projectId=" + projectId + ", picName=" + picName + ", picPath=" + picPath + ", picStatus="
				+ picStatus + "]";
	}
	
}
