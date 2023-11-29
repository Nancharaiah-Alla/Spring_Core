package com.nanch.xml_config;

public class Wand implements Stick {
	
	private String color;	
	
	public Wand() {
		
	}

//	public Wand(String color) {
//		super();
//		this.color = color;
//	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Wand [color=" + color + "]";
	}

	public void stick() {
		
		System.out.println("Wand stick with " + this.getColor() + " color.");
		
	}

}
