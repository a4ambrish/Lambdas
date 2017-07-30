package com.java0to1.modal;

import java.io.Serializable;

public class SocialNetwork implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String skype;
	String facebook;
	String twitter;
	String stackoverflow;
	String linkedIn;
	public String getSkype() {
		return skype;
	}
	public void setSkype(String skype) {
		this.skype = skype;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getStackoverflow() {
		return stackoverflow;
	}
	public void setStackoverflow(String stackoverflow) {
		this.stackoverflow = stackoverflow;
	}
	public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public SocialNetwork(String skype, String facebook, String twitter, String stackoverflow, String linkedIn) {
		super();
		this.skype = skype;
		this.facebook = facebook;
		this.twitter = twitter;
		this.stackoverflow = stackoverflow;
		this.linkedIn = linkedIn;
	}
	public SocialNetwork() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SocialNetwork [skype=" + skype + ", facebook=" + facebook + ", twitter=" + twitter + ", stackoverflow="
				+ stackoverflow + ", linkedIn=" + linkedIn + "]";
	}
	
	
}
