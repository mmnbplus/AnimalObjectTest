package com.mm.t.pojo;

import com.mm.t.interfaces.LandAnimal;
import com.mm.t.interfaces.WaterAnimal;

/**
 * «‡Õ‹
 * @author computer
 *
 */
public class Frog extends Animal implements LandAnimal,WaterAnimal{
	
	int numberOfLegs = 0;
	boolean gillFlag = false;
	boolean laysEggs = false;
	
	public Frog() {
		this.name = "«‡Õ‹";
		this.mammal = false;
		this.camivorous = false;
		this.numberOfLegs = 4;
	}
	
	@Override
	public void sayHello() {
		super.sayHello();
		System.out.println("ﬂ…ﬂ…Ω–");
	}
	
	@Override
	public void sayHello(int moodval) {
		super.sayHello(moodval);
		System.out.println("ﬂ…ﬂ…Ω–");
	}

	@Override
	public void getGillFlag() {
		System.out.println(this.name+"≤˙¬—");
	}

	@Override
	public void getLaysEggs() {
		System.out.println(this.name+"”–»˙");
	}

	@Override
	public void getNumberOfLegs() {
		System.out.println(this.name+"”–"+numberOfLegs+"ÃıÕ»");
	}

}
