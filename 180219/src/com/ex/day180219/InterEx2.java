package com.ex.day180219;

interface Inter1 {
	public int getA();
}
/////////////////////////
interface Inter2 {
	public int getA();
}
/////////////////////////
interface Inter3 extends Inter1, Inter2 { //인터페이스 간 다중 상속 가능
	public int getData();
}
/////////////////////////

public class InterEx2 implements Inter3{
	
	int a = 100;
	@Override
	public int getA() {
		return a;
	}

	@Override
	public int getData() {
		return a+10;
	}

	public static void main(String[] args) {
		
		InterEx2 it = new InterEx2();
		Inter1 it1 = it;
		Inter2 it2 = it;
		Inter3 it3 = it;
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
		System.out.println(it.toString());
		
		// 인터페이스 - 다른 여러 객체들의 공통점을 제안하고 공유함
		// 인터페이스에 정의된 추상 메서드를 각 객체에 맞게 재정의
		// 다형성
		
		String res = null;
		if(it1 instanceof Inter2) {
			res = "맞다";
		} else {
			res = "아니다";
		}
		System.out.println("it1 instanceof Inter2 : " + res);
		
		// 비교 객체 instanceof 비교 클래스명
		// 객체가 명시한 클래스로부터 생성이 되었는지에 대한 형식을 비교
		
	}
}
