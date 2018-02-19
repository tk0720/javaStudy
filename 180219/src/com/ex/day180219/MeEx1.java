package com.ex.day180219;

// 클래스에서 final

final class Me1 {
	int var = 100;
	public void setVar(int var) {
		this.var = var;
	}
}

public class MeEx1 /*extends Me1*/{ //final로 인해 상속 불가능
	
	public void setVar(int var) {
//		this.var = var;
	}

	public static void main(String[] args) {
		
		MeEx1 me1 = new MeEx1();
		me1.setVar(1000);

	}

}
