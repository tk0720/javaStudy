package com.ex.day180220;

public class EnumEx2 {
	
	public enum Item {
		Add, Del, Search, Cancel
	}
	
	public static void main(String[] args) {
		
		Item a1 = Item.Search;
		if(a1 instanceof Object) { // 열거형이 객체인지 비교
			System.out.println(a1.toString() + "^^");
			System.out.println("OK! instanceof Object");
			System.out.println("저장된 실제 정수값 : " + a1.ordinal());
		}
		
		Item[] items = Item.values();	// 열거형 객체들은 배열로 관리되는데 values()를 통해 확인 가능
		System.out.println("items.length : " + items.length);
		
		for(Item n : Item.values()) System.out.println(n + ":" + n.ordinal());
		
	}

}
