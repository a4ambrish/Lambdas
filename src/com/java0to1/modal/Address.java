package com.java0to1.modal;

import java.io.Serializable;

import com.java0to1.modal.ApplicationConstants.AddressType;

public class Address implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String line1;
	String line2;
	String city;
	String state;
	String pincode;
	AddressType addressType;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public AddressType getAddressType() {
		return addressType;
	}
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Address(String line1, String line2, String city, String state, String pincode, AddressType addressType) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.addressType = addressType;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + ", addressType=" + addressType + "]";
	} 
	
	
	
}
