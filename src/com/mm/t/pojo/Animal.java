package com.mm.t.pojo;

public class Animal {
	
	public boolean mammal = false;
	public boolean camivorous = false;
	public int mood = 0;
	public String name = null;
	
	public void sayHello() {
		System.out.print(name+"通常情况下，和人打招呼的方式为：");
	}
	
	public void sayHello(int moodval) {
		String m = null;
		switch(moodval) {
			case 1: m="被抚摸情绪好的情况下，打招呼的方式为:";break;
			case 2: m="烦躁的时候，会：";break;
		}
		System.out.print(name+m);
	}
	
	public void isMammal() {
		String m = mammal? "": "不";
		System.out.println(name+m+"是哺乳动物");
	}
	
	public void isCarnivorous() {
		String c = mammal? "": "不";
		System.out.println(name+c+"是食肉动物");
	}
	
	public void setMood(int mood) {
		this.mood = mood;
	}
	
	public int getMood() {
		return this.mood;
	}
}
