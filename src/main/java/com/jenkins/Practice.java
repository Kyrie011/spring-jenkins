package com.jenkins;

class A{
	public void method() {
		System.out.println("A");
	}
}
class B extends A{
	public void method() {
		System.out.println("B");
	}
}
public class Practice {
	
	
	public static void Order(String str) {
		System.out.println("String");
	}
	public static void Order(Object o) {
		System.out.println("Object");
	}
	public static void main(String[] args) {
		Order(null);
		
		A obj = new B();
		obj.method();
	}
}
