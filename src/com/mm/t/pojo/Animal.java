package com.mm.t.pojo;

public class Animal {
	
	public boolean mammal = false;
	public boolean camivorous = false;
	public int mood = 0;
	public String name = null;
	
	public void sayHello() {
		System.out.print(name+"ͨ������£����˴��к��ķ�ʽΪ��");
	}
	
	public void sayHello(int moodval) {
		String m = null;
		switch(moodval) {
			case 1: m="�����������õ�����£����к��ķ�ʽΪ:";break;
			case 2: m="�����ʱ�򣬻᣺";break;
		}
		System.out.print(name+m);
	}
	
	public void isMammal() {
		String m = mammal? "": "��";
		System.out.println(name+m+"�ǲ��鶯��");
	}
	
	public void isCarnivorous() {
		String c = mammal? "": "��";
		System.out.println(name+c+"��ʳ�⶯��");
	}
	
	public void setMood(int mood) {
		this.mood = mood;
	}
	
	public int getMood() {
		return this.mood;
	}
}
