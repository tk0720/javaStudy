package com.ex.day180209;

public class StaticTest1 {
	
	int a;
	static String s;
	
	public static void main(String[] args) {
		
		s = "�ڹ� ����ƽ ����";
		
		StaticTest1 st1 = new StaticTest1();
		
		// a = 1000; ���� : static ����, ��ü�� ���������� ���� ���� ����
		st1.a = 1000;
		System.out.println("s : " + s);

	}

}
