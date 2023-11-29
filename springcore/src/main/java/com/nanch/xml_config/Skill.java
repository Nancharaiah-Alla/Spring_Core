package com.nanch.xml_config;

import java.util.List;

public class Skill {
	
	private List<String> skills;
	
	

	public Skill() {
		super();
	}

	public Skill(List<String> skills) {
		super();
		this.skills = skills;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Skill [skills=" + skills + "]";
	}
	
	

}
