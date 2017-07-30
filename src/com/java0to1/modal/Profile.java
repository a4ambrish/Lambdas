package com.java0to1.modal;

import java.util.ArrayList;
import java.util.List;

import com.java0to1.modal.ApplicationConstants.ContactType;

public class Profile {

	String fname;
	String lname;
	Title title ;
	SocialNetwork socialNetwork;
	List<Contact> contacts;
	List<Address> addresses;
	ArrayList<ContactType> contactTypes ;
	public Profile()
	{
		socialNetwork = new SocialNetwork();
		contacts = new ArrayList<Contact>();
		addresses = new ArrayList<Address>();
		 contactTypes = new ArrayList<ContactType>();
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public SocialNetwork getSocialNetwork() {
		return socialNetwork;
	}

	public void setSocialNetwork(SocialNetwork socialNetwork) {
		this.socialNetwork = socialNetwork;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public ArrayList<ContactType> getContactTypes() {
		return contactTypes;
	}

	public void setContactTypes(ArrayList<ContactType> contactTypes) {
		this.contactTypes = contactTypes;
	}

	@Override
	public String toString() {
		return "Profile [fname=" + fname + ", lname=" + lname + ", title=" + title + ", socialNetwork=" + socialNetwork
				+ ", contacts=" + contacts + ", addresses=" + addresses + ", contactTypes=" + contactTypes + "]";
	}
	
	
}
