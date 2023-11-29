package com.nanch.xml_config;

public class Broom implements Stick {

	private String color;


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	@Override
	public String toString() {
		return "Broom [color=" + color + "]";
	}

	public void stick() {
		
		System.out.println("Broom stick with " + this.getColor() + " color.");
	}

}
