package com.ex.day180220;

public class MemberInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	// 내부 클래스 정의
	class Inner {
		public void printData() {
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b); // private도 접근 가능
			System.out.println("static int c : " + c);
		}
	}

	public static void main(String[] args) {
//		MemberInner outer = new MemberInner();
//		MemberInner.Inner inner = outer.new Inner();
		
		MemberInner.Inner inner = new MemberInner().new Inner();
		inner.printData();
	}

}
