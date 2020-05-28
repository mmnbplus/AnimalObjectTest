package com.mm.t.main;

import com.mm.t.pojo.Animal;
import com.mm.t.pojo.Cat;
import com.mm.t.pojo.Dog;
import com.mm.t.pojo.Frog;

public class Main {
	
	public static void logCutLine() {
		
		StringBuffer sBuffer = new StringBuffer();
				
		for(int i=0;i<50;i++) {
			sBuffer.append('=');
		}
		
		System.out.println(sBuffer);
		
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.isMammal();
		dog.isCarnivorous();
		dog.sayHello();
		dog.sayHello(1);
		dog.sayHello(2);
		
		Main.logCutLine();
		
		Animal cat = new Cat();
		cat.isMammal();
		cat.isCarnivorous();
		cat.sayHello();
		cat.sayHello(1);
		cat.sayHello(2);
		
		Main.logCutLine();
		
		Frog frog = new Frog();
		frog.isMammal();
		frog.isCarnivorous();
		frog.sayHello();
		frog.sayHello(1);
		frog.sayHello(2);
		frog.getGillFlag();
		frog.getLaysEggs();
		
	}
}
