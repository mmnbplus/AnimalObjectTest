package com.mm.t.pojo;

import com.mm.t.interfaces.LandAnimal;

/**
 * Ã¨
 * @author computer
 *
 */
public class Cat extends Animal implements LandAnimal{
	
	int numberOfLegs = 0;
	
	public Cat() {
		this.name = "Ã¨";
		this.mammal = true;
		this.camivorous = true;
		this.numberOfLegs = 4;
	}

	@Override
	public void getNumberOfLegs() {
		System.out.println(this.name+"ÓÐ"+numberOfLegs+"ÌõÍÈ");
	}
	
	@Override
	public void sayHello() {
		super.sayHello();
		System.out.println("ß÷ß÷½Ð");
	}
	
	@Override
	public void sayHello(int moodval) {
		super.sayHello(moodval);
		System.out.println("¹¾àà¹¾àà½Ð");
	}
	
	
	
}
