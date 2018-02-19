package com.ex.day180219;

// 메서드에서 final : 상속 관계에서 오버라이딩 확장 불가

class Me {
	int var = 100;
	public final void setVar(int var) {
		this.var = var;
	}
}

public class MeEx extends Me{
	
//	public void setVar(int var) {
//		this.var = var;
//	}
	// 오버라이딩 오류

	public static void main(String[] args) {
		
		MeEx me = new MeEx();
		me.setVar(1000);
	}

}
