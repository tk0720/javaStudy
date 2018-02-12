package com.ex.day180212;

public class StringEx2 {

	public static void main(String[] args) {
		
		String s1 = "Tae Tae";
		String s2 = new String("TAE TAE");
		String msg = null;
		
		if(s1.equals(s2)) {
		// 객체 내용 비교
			msg = "s1과 s2는 내용이 같다";
		} else {
			msg = "s1과 s2는 내용이 다르다";
		}
		System.out.println(msg);
		
		if(s1.equalsIgnoreCase(s2)) {
		// 대소문자 구별 없이 내용 비교
			msg = "s1과 s2는 대소문자 구별없이 같다";
		} else {
			msg = "s1과 s2는 대소문자 구별없이도 다르다";
		}
		System.out.println(msg);
		
		// format 형식에 맞춰 String 객체 생성
		msg = String.format("%20s,%s", s1,s2);
		// %20s는 20자의 String 형식으로 왼쪽에서 칸을 띄운 다음 s1의 값 출력
		System.out.println("msg :"+msg);
		
	}

}
