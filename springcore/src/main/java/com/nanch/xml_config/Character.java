package com.nanch.xml_config;

public class Character {
	
	private int id;
	private String name;
	private String mail;
		
	public Character() {
		super();
	}
	
	public Character(int id, String name, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}	

	
}
