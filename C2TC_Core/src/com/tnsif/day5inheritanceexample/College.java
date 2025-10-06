package com.tnsif.day5inheritanceexample;

public class College {
 private String CollegeName;
 private String ColllegeLocation;
 public String getCollegeName() {
	return CollegeName;
 }
 public void setCollegeName(String collegeName) {
	CollegeName = collegeName;
 }
 public String getColllegeLocation() {
	return ColllegeLocation;
 }
 public void setColllegeLocation(String colllegeLocation) {
	ColllegeLocation = colllegeLocation;
 }
 @Override
 public String toString() {
	return "College [CollegeName=" + CollegeName + ", ColllegeLocation=" + ColllegeLocation + "]";
 }
}
