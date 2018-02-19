package com.ex.day180219;

abstract class Unit {
	protected String name;
	protected int energy;
	abstract public void decEnergy();
	public int getEnergy(){
		return energy;
	}
}

// 추상 클래스 - 공통된 부분만 구현, 공통x는 abstract 예약어를 사용한 미완성 클래스
// 클래스의 객체를 자체적으로 생성 x, 다른 클래스로 상속 되어 미완성 된 부분은 반드시 재정의
// 특정 클래스에서 일부는 공통, 일부는 다른 변화가 있을 때 상속으로 오버라이딩하여 사용


class Terran extends Unit {
	boolean fly;
	public Terran(String n, boolean b) {
		name = n;
		energy = 100;
		fly = b;
	}
	
	public void decEnergy() {
		energy -= 3;
	}
}


class Zerg extends Unit {
	boolean fly;
	public Zerg(String n, boolean b) {
		name = n;
		energy = 100;
		fly = b;
	}
	
	public void decEnergy() {
		energy -= 6;
	}
}


class Protoss extends Unit {
	boolean fly;
	public Protoss(String n, boolean b) {
		name = n;
		energy = 100;
		fly = b;
	}
	
	public void decEnergy() {
		energy--;
	}
	
}


public class UnitTest {

	public static void main(String[] args) {
		
		Zerg z1 = new Zerg("Hydralisk", false);
		z1.decEnergy();
		System.out.println("z1의 Energy : " + z1.getEnergy());
		
		Protoss p1 = new Protoss("Corsair", true);
		p1.decEnergy();
		System.out.println("p1의 Energy : " + p1.getEnergy());
		
		Terran t1 = new Terran("Marine", false);
		t1.decEnergy();
		System.out.println("t1의 Energy : " + t1.getEnergy());

	}

}
