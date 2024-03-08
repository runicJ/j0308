package t8_polymorphism;

public class Cc extends Aa {
	public int su = 30;
	
	public Cc() {
		System.out.println("이곳은 Cc 기본 생성자 입니다.");
	}
	
	@Override  // 메소드만 가능
	public void modCc() {
		System.out.println("이곳은 Cc클래스의 modCc메소도 입니다.");
	}

	@Override  // 부모가 가지고 있던 것
	public void modHH(int a, int b) {
		System.out.println("두수의 합 : " + (a + b));
	}
}
