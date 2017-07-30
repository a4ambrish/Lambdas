package com.java0to1.modal;

import java.io.Serializable;
import java.util.List;

import com.java0to1.modal.ApplicationConstants.ContactType;

public class Contact implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String mobile;
	String phone;
	String emailId;
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String mobile, String phone, String emailId) {
		super();
		this.mobile = mobile;
		this.phone = phone;
		this.emailId = emailId;
		
	}
	@Override
	public String toString() {
		return "Contact [mobile=" + mobile + ", phone=" + phone + ", emailId=" + emailId + "]";
	}
	
	
	
}
