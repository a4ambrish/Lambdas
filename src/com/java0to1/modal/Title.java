package com.java0to1.modal;

import java.io.Serializable;

public class Title implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String abrTitle;
	private String descTitle;
	public String getAbrTitle() {
		return abrTitle;
	}
	public void setAbrTitle(String abrTitle) {
		this.abrTitle = abrTitle;
	}
	public String getDescTitle() {
		return descTitle;
	}
	public void setDescTitle(String descTitle) {
		this.descTitle = descTitle;
	}
	public Title() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Title(String abrTitle, String descTitle) {
		super();
		this.abrTitle = abrTitle;
		this.descTitle = descTitle;
	}
	@Override
	public String toString() {
		return "Title [abrTitle=" + abrTitle + ", descTitle=" + descTitle + "]";
	}
	
	
	
}
