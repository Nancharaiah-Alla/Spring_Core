package com.nanch.xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		
//		xmlConfigCharacter();
		
		xmlConfigCharacterNStick();

	}

	private static void xmlConfigCharacter() {

		ApplicationContext context = new ClassPathXmlApplicationContext("character.xml");

		Character character = context.getBean("harry-data", Character.class);
		System.out.println(character.getName());

	}
	
	private static void xmlConfigCharacterNStick() {

		ApplicationContext context = new ClassPathXmlApplicationContext("characterNStick.xml");

//		CharacterNStick characterNStick = context.getBean("harry-data", CharacterNStick.class);
		CharacterNStick characterNStick = context.getBean("harry-data-autowire-t", CharacterNStick.class);
		Broom broom = context.getBean("broom", Broom.class);
		
		System.out.println(characterNStick.getName() + "'s Broom Color is " + characterNStick.getStick().getColor());
//		characterNStick.getStick().stick();
	}
}
