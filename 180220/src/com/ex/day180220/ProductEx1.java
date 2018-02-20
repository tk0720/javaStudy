package com.ex.day180220;

class Product {
	private String name; // 멤버 변수 선언
	private int price;

	public Product(String name, int price) { // 생성자
		this.name = name;
		this.price = price;
	}

	public boolean equals(Object obj) {
		boolean result = false;
		if ((obj != null) && (obj instanceof Product)) {
			Product p = (Product) obj;
			if ((name.equals(p.name)) && (price == p.price)) {
				result = true;
			}
		}
		return result;
	}

	public int hashCode() {
		return ((name.hashCode()) ^ (new Integer(price).hashCode())); // xor 연산
	}

	public String toString() {
		return name;
	}
}

public class ProductEx1 {

	public static void main(String[] args) {
		
		Product p1 = new Product("En,Ca", 7078);
		Product p2 = new Product("En,Ca", 7078);
		System.out.println(p1 == p2);	// 참조변수, 객체 생성 위치가 다르므로 false
		System.out.println(p1.equals(p2));	// 객체 내용 비교 true
		System.out.println("p1 hashCode : " + p1.hashCode() + ", p1 : " + p1);
		System.out.println("p2 hashCode : " + p2.hashCode() + ", p2 : " + p2);
		// 참조변수를 통해 객체가 기억하는 값 출력
		// p1,p2라고만 출력해도 자동으로 toString() 메서드 호출되어 name 멤버값 출력

	}

}
