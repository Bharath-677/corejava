package modifiers1;

import modifiers2.C;
import modifiers2.D;

// public access modifier 
// we can creat public class, variables,methods
//we can acces any wear in the project

//protected
//we can't creat protected class
//but we can creat protected variables & methods 
//we can access within the class & within the packag out side of the sub class

// default access modifier
// we can creat default class ,variables, methods
//we can acces with in the class and with in the packag

//private access modifier
//we can't creat private class 
//but we can creat private variables & methodes
//we can acces with in the class only

 class A extends C {
	protected int id;
	
	protected void m1() {
		
		System.out.println("m1 method modifiers1");
	}
	
	
public static void main(String[] args) {
	A a=new A ();
	System.out.println(a.id);
	a.m1();
	a.cm1();
	
	B b=new B();
	b.bm1();
	
//	C c=new C();
//	c.cm1();
	
	D d=new D();
	d.dm1();
	
	
	
}
}
