package com.ex.day180209;

class StaticCount {
	
	int c;
	static int count; //클래스 변수
	public StaticCount() {
		c++;
		count++;
	}
}

public class StaticTest3 {

	public static void main(String[] args) {
		
		StaticCount sc1 = new StaticCount();
		System.out.println("sc1의 c : "+sc1.c+", sc1의 count : "+sc1.count);
		
		
		StaticCount sc2 = new StaticCount();
		System.out.println("sc2의 c : "+sc2.c+", sc2의 count : "+sc2.count);
		
		
		StaticCount sc3 = new StaticCount();
		System.out.println("sc3의 c : "+sc3.c+", sc3의 count : "+sc3.count);
		
		// instance변수 c는 객체가 생성되는 공간에 각각 하나씩 가지고 있음
		// static변수 count는 정적인 공간(static 영역)에 유일하게 생성 되어 모든 객체들로부터 공유할 수 있는 공간을 의미

	}

}