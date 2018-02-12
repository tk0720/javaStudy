package com.ex.day180212;

public class StringEx1 {
	
	public static void main(String[] args) {
		
		// String 암시적 객제 생성
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		// s2 문자열 생성 하지만 constant pool에 등록할 땐
		// s1이 이미 등록 되어 있는 객체 > 모든 것을 취소 > s1 객체의 참조 변수를 받음
		
		if(s1==s2) {
			System.out.println("s1과 s2는 같다");
		} else {
			System.out.println("s1과 s2는 같지 않다");
		}
		
		// String 명시적 객체 생성
		// heap 영역에 무조건 공간을 할당 받아 객체 생성 > 참조 변수 다름
		String s3 = new String("Little Star");
		String s4 = new String("Little Star");
		
		// "=="은 피연산자가 객체일 경우 참조변수 비교
		if(s3==s4) {
//		if(s3.equals(s4))
//		equals() 객체의 내용을 비교할 때 사용
			System.out.println("s3과 s4는 같다");
		} else {
			System.out.println("s3과 s4는 같지 않다");
		}
	}
}
