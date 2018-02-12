package com.ex.day180209;

public class OverloadingTest {

	public void getLength(int n) {
		String s = String.valueOf(n);
		getLength(s);
	}
	
	void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);
	}
	
	private int getLength(String str) {
		System.out.println("입력한 값의 길이 : "+str.length());
		return 0;
	}
	
	public static void main(String[] args) {
		OverloadingTest ot = new OverloadingTest();
		ot.getLength(100);
		ot.getLength(3.14f);
		ot.getLength("10000");
	}

}
