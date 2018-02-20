package com.ex.day180220;

abstract class TestAbst {
	int data = 1000;
	public abstract void printData();
}

public class AnonyInner1 {
	
	TestAbst inn = new TestAbst() {
		
		@Override
		public void printData() {
			System.out.println("data : " + data);
		}
	};
	
	public static void main(String[] args) {
		AnonyInner1 ai = new AnonyInner1();
		ai.inn.printData(); // 참조변수 ai를 통해 내부에 존재하는 익명 클래스 참조변수 inn으로 메서드 호출
	}

}
