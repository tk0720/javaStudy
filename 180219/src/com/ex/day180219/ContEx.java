package com.ex.day180219;

// 변수에서 final

class Cont {
	final int VAR = 100;
	public void setVar(int var) {
//		VAR = var; // 값 변경할 수 없음(상수화) final
	}
}

class ContEx {

	public static void main(String[] args) {
		
		Cont ct = new Cont();
		ct.setVar(1000);

	}

}
