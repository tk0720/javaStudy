package com.ex.day180209;

class StaticTest2_1 {
	
	String s1 = "static";
	
	static String s2 = "STATIC";
	
	public static String getString() {
		return s2; // s1 return하면 오류 : instance 변수(멤버변수)는 참조할 수 없음
	}
}

public class StaticTest2 {

	public static void main(String[] args) {
		System.out.println("s2 : "+StaticTest2_1.getString());
	}

}