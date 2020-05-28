package com.mm.t.pojo;

import com.mm.t.interfaces.LandAnimal;

/**
 * π∑
 * @author computer
 *
 */
public class Dog extends Animal implements LandAnimal{
	int numberOfLegs = 0;
	
	public Dog() {
		this.name = "π∑";
		this.mammal = true;
		this.camivorous = true;
		this.numberOfLegs = 4;
	}

	@Override
	public void getNumberOfLegs() {
		System.out.println(this.name+"”–"+numberOfLegs+"ÃıÕ»");
	}
	
	@Override
	public void sayHello() {
		super.sayHello();
		System.out.println("“°Œ≤∞Õ");
	}
	
	@Override
	public void sayHello(int moodval) {
		super.sayHello(moodval);
		System.out.println("ÕÙÕÙΩ–");
	}
	
}
