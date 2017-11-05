package com.ht.model;

public class New {

	private int newId;
	private String newName;
	private String newTime;
	private String userNickName;
	private String newContent;
	private int newStatus;
	public int getNewId() {
		return newId;
	}
	public void setNewId(int newId) {
		this.newId = newId;
	}
	public String getNewName() {
		return newName;
	}
	public void setNewName(String newName) {
		this.newName = newName;
	}
	public String getNewTime() {
		return newTime;
	}
	public void setNewTime(String newTime) {
		this.newTime = newTime;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getNewContent() {
		return newContent;
	}
	public void setNewContent(String newContent) {
		this.newContent = newContent;
	}
	public int getNewStatus() {
		return newStatus;
	}
	public void setNewStatus(int newStatus) {
		this.newStatus = newStatus;
	}
	@Override
	public String toString() {
		return "New [newId=" + newId + ", newName=" + newName + ", newTime=" + newTime + ", userNickName="
				+ userNickName + ", newContent=" + newContent + ", newStatus=" + newStatus + "]";
	}
	
}
