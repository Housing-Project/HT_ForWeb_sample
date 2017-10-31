package com.ht.model;

public class Plan {
    
   private int planId;
   private String planName;
   private int planFloor;
   private int planArea;
   private int planStatus;
   private String planPicPath;
   
   public Plan(){
	   
   }
   public int getPlanId() {
	   return planId;
   }
   public void setPlanId(int planId) {
	   this.planId = planId;
   }
   public String getPlanName() {
	   return planName;
   }
   public void setPlanName(String planName) {
	   this.planName = planName;
   }
   public int getPlanFloor() {
	   return planFloor;
   }
   public void setPlanFloor(int planFloor) {
	   this.planFloor = planFloor;
   }
   public int getPlanArea() {
	   return planArea;
   }
   public void setPlanArea(int planArea) {
	   this.planArea = planArea;
   }
   public int getPlanStatus() {
	   return planStatus;
   }
   public void setPlanStatus(int planStatus) {
	   this.planStatus = planStatus;
   }
   public String getPlanPicPath() {
	   return planPicPath;
   }
   public void setPlanPicPath(String planPicPath) {
	   this.planPicPath = planPicPath;
   }
@Override
public String toString() {
	return "Plan [planId=" + planId + ", planName=" + planName + ", planFloor=" + planFloor + ", planArea=" + planArea
			+ ", planStatus=" + planStatus + ", planPicPath=" + planPicPath + "]";
}
  
   
   
}
