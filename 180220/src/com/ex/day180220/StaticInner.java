package com.ex.day180220;

public class StaticInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	static class Inner {
		// static 내부 클래스 > 내부 클래스 멤버 중 하나라도 static 멤버가 있을 때 사용
		static int d = 1000;
		public void printData() {
//			System.out.println("int a : " + a);
//			System.out.println("private int b : " + b);
			// static은 같은 static 영역에 있는 멤버들만 바로 참조 가능
			// 그 외의 멤버 변수들은 객체의 참조변수를 통해 가능
			// static 내부 클래스에서 다른 공간의 instance변수(멤버)를 참조할 수 없다.
			System.out.println("static int c : " + c);
			System.out.println("static int d : " + d);
		}
	}

	public static void main(String[] args) {
		// 독립된 객체에서 static 내부 클래스를 생성할 때
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.printData();
		// static은 객체 생성하지 않고 접근 가능 > 외부클래스명.내부클래스_생성자()로 생성 가능
		
		// StaticInner라는 외부 클래스 내에서 생성할 때
//		Inner inner = new Inner();
//		inner.printData();
	}

}
