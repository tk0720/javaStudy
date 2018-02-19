package com.ex.day180219;

class Parent {
	
	String msg = "Parent 클래스";
	public String getMsg() {
		return msg;
	}
}

class Child extends Parent {
	
	String msg = "Child 클래스";
	public String getMsg() { //메소드 오버라이딩
		return msg;
	}
	
}

public class OverridingEx {

	public static void main(String[] args) {
		
		Child cd = new Child();
		System.out.println("cd : " + cd.getMsg());
		
		Parent pt = new Parent();
		System.out.println("pt : " + pt.getMsg());

	}

}
