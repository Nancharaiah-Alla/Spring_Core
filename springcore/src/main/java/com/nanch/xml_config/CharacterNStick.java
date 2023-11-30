package com.nanch.xml_config;

public class CharacterNStick {

	private int id;
	private String name;
	private Stick stick;

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

	public Stick getStick() {
		return stick;
	}

	public void setStick(Stick stick) {
		this.stick = stick;
	}

	@Override
	public String toString() {
		return "CharacterNStick [id=" + id + ", name=" + name + ", stick=" + stick + "]";
	}
}
