package com.mm.t.pojo;

import com.mm.t.interfaces.LandAnimal;

/**
 * ��
 * @author computer
 *
 */
public class Dog extends Animal implements LandAnimal{
	int numberOfLegs = 0;
	
	public Dog() {
		this.name = "��";
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
		System.out.println("ҡβ��");
	}
	
	@Override
	public void sayHello(int moodval) {
		super.sayHello(moodval);
		System.out.println("������");
	}
	
}
