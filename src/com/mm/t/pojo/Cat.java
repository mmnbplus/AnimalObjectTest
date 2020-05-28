package com.mm.t.pojo;

import com.mm.t.interfaces.LandAnimal;

/**
 * è
 * @author computer
 *
 */
public class Cat extends Animal implements LandAnimal{
	
	int numberOfLegs = 0;
	
	public Cat() {
		this.name = "è";
		this.mammal = true;
		this.camivorous = true;
		this.numberOfLegs = 4;
	}

	@Override
	public void getNumberOfLegs() {
		System.out.println(this.name+"��"+numberOfLegs+"����");
	}
	
	@Override
	public void sayHello() {
		super.sayHello();
		System.out.println("������");
	}
	
	@Override
	public void sayHello(int moodval) {
		super.sayHello(moodval);
		System.out.println("���๾���");
	}
	
	
	
}
