package com.eshopms.model;

import java.util.Date;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer UId;
	private String UMobile;
	private Integer UAccount;
	private String UPwd;
	private String USecurityQuestion;
	private String UEmail;
	private String UName;
	private Date UBirthday;
	private String USex;
	private String UHeadImage;
	private String UIdentityCode;
	private Integer UStatus;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String UMobile, Integer UAccount, String UPwd,
			String USecurityQuestion, String UEmail, String UName,
			Date UBirthday, String USex, String UHeadImage,
			String UIdentityCode, Integer UStatus) {
		this.UMobile = UMobile;
		this.UAccount = UAccount;
		this.UPwd = UPwd;
		this.USecurityQuestion = USecurityQuestion;
		this.UEmail = UEmail;
		this.UName = UName;
		this.UBirthday = UBirthday;
		this.USex = USex;
		this.UHeadImage = UHeadImage;
		this.UIdentityCode = UIdentityCode;
		this.UStatus = UStatus;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public String getUMobile() {
		return this.UMobile;
	}

	public void setUMobile(String UMobile) {
		this.UMobile = UMobile;
	}

	public Integer getUAccount() {
		return this.UAccount;
	}

	public void setUAccount(Integer UAccount) {
		this.UAccount = UAccount;
	}

	public String getUPwd() {
		return this.UPwd;
	}

	public void setUPwd(String UPwd) {
		this.UPwd = UPwd;
	}

	public String getUSecurityQuestion() {
		return this.USecurityQuestion;
	}

	public void setUSecurityQuestion(String USecurityQuestion) {
		this.USecurityQuestion = USecurityQuestion;
	}

	public String getUEmail() {
		return this.UEmail;
	}

	public void setUEmail(String UEmail) {
		this.UEmail = UEmail;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public Date getUBirthday() {
		return this.UBirthday;
	}

	public void setUBirthday(Date UBirthday) {
		this.UBirthday = UBirthday;
	}

	public String getUSex() {
		return this.USex;
	}

	public void setUSex(String USex) {
		this.USex = USex;
	}

	public String getUHeadImage() {
		return this.UHeadImage;
	}

	public void setUHeadImage(String UHeadImage) {
		this.UHeadImage = UHeadImage;
	}

	public String getUIdentityCode() {
		return this.UIdentityCode;
	}

	public void setUIdentityCode(String UIdentityCode) {
		this.UIdentityCode = UIdentityCode;
	}

	public Integer getUStatus() {
		return this.UStatus;
	}

	public void setUStatus(Integer UStatus) {
		this.UStatus = UStatus;
	}

	@Override
	public String toString() {
		return "User [UId=" + UId + ", UMobile=" + UMobile + ", UAccount="
				+ UAccount + ", UPwd=" + UPwd + ", USecurityQuestion="
				+ USecurityQuestion + ", UEmail=" + UEmail + ", UName=" + UName
				+ ", UBirthday=" + UBirthday + ", USex=" + USex
				+ ", UHeadImage=" + UHeadImage + ", UIdentityCode="
				+ UIdentityCode + ", UStatus=" + UStatus + "]";
	}

}