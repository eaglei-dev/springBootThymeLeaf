package com.expample.demo.User;

public class UserData {
	private String userName;
	private Integer userAge;
	private String userEmail;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public UserData(String userName, Integer userAge, String userEmail) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "UserData [userName=" + userName + ", userAge=" + userAge + ", userEmail=" + userEmail + "]";
	}
	
	
}
