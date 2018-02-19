package com.ex.day180219;

abstract class AbsEx1 {
	int a = 100;	// 변수
	final String str = "abstract test"; // 상수
	public String getStr(){ // 일반 메서드
		return str;
	}
	
	// 추상 메서드 body가 없다
	public abstract int getA();
}
