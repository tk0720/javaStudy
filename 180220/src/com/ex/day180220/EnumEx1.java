package com.ex.day180220;

public class EnumEx1 {
	
	public enum Lesson {
		// enum : 상수를 가지고 생성되는 객체를 한곳에 모음, 하나의 참조 자료형
		// java에선 특정 상수를 미리 정의하여 나열된 값만 정의할 수 있다.
		// 특정 클래스 내에 열거형을 정의하면 내부 클래스가 된다.
		// java.lang이라는 패키지에 Enum이라는 추상 클래스를 상속받는 내부 클래스가 정의 됨
		JAVA, XML, EJB
	}

	public static void main(String[] args) {
		
		Lesson le = Lesson.JAVA; //열거형 Lesson의 값 중에 JAVA를 대입
		
		System.out.println("le : " + le);
		System.out.println("XML : " + Lesson.XML);
	}

}
