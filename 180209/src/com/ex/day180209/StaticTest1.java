package com.ex.day180209;

public class StaticTest1 {
	
	int a;
	static String s;
	
	public static void main(String[] args) {
		
		s = "자바 스태틱 변수";
		
		StaticTest1 st1 = new StaticTest1();
		
		// a = 1000; 오류 : static 영역, 객체의 참조변수를 통해 접근 가능
		st1.a = 1000;
		System.out.println("s : " + s);

	}

}
