package com.ex.day180209;

public class ThisConstrEx {
	
	String str;
	public ThisConstrEx() {
		this(" "); // this() 생성자 첫번째 줄에서만 가능
	}
	
	public ThisConstrEx(char[] ch) {
		this(String.valueOf(ch));
	}
	
	public ThisConstrEx(long lo) {
		this(String.valueOf(lo));
	}
	
	public ThisConstrEx(boolean b) {
		this(String.valueOf(b));
	}
	
	public ThisConstrEx(String str) {
		this.str = str;
		System.out.println(str+"의 길이 : "+str.length());
	}

	public static void main(String[] args) {
		char[] ch = {'t','a','e'};
		long lo = 900000000;
		boolean b = true;
		
		ThisConstrEx te1 = new ThisConstrEx();
		ThisConstrEx te2 = new ThisConstrEx(ch);
		ThisConstrEx te3 = new ThisConstrEx(lo);
		ThisConstrEx te4 = new ThisConstrEx(b);
		
	}

}