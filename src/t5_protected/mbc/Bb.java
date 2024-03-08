package t5_protected.mbc;

import t5_protected.kbs.Aa;  //ctrl shift o

public class Bb extends Aa {
	public int a2 = 10;
	protected int b2 = 20;
	int c2 = 30;
	private int d2 = 40;
	
	public void modA2() {
		System.out.println("이곳은 Bb클래스의 modA메소드 입니다.");
	}
	protected void modB2() {
		System.out.println("이곳은 Bb클래스의 modB메소드 입니다.");
	}
	void modC2() {
		System.out.println("이곳은 Bb클래스의 modC메소드 입니다.");
	}
	private void modD2() {
		System.out.println("이곳은 Bb클래스의 modD메소드 입니다.");
	}
	
	@Override
	public void test() {
		modC2();
		
		a = 100;  //public
		b = 200;
		//c = 300;  //default면 불가
		//d = 400;
		int d = getD(); // 여기 d는 부모 d와 관계가 없음.  //부모의 return d를 받아야
		System.out.println("d " + d);
	}
}
