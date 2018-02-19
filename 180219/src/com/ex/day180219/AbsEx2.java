package com.ex.day180219;

abstract class AbsEx2 extends AbsEx1 {
	
	public int getA() {		// 부모 추상 클래스의 getA()라는 추상 메서드 재정의
		return a;
	}
	
	public abstract String getStr();
	// 추상 메서드 정의
}
