package com.ex.day180220;

public class EnumEx3 {
	
	public enum Item {
		Add(5), Del(11), Search(2), Cancel(22); // ; <- 클래스 내용 수정 or 오버라이딩 할 때 사용
		private final int var;
		
		Item(int v) {	//생성자
			var = v;
		}
		
		public int getVar() {
			return var;
		}
	}

	public static void main(String[] args) {
		for(Item n : Item.values()) {
			System.out.println(n + ":" + n.getVar());
		}
	}

}
