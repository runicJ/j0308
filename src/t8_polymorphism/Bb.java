package t8_polymorphism;

public class Bb extends Aa {
	public int su = 20;
	
	public Bb() {
		System.out.println("이곳은 Bb 기본 생성자 입니다.");
	}
	
	public void modBb() {
		System.out.println("이곳은 Bb클래스의 modBb메소도 입니다.");
	}

	@Override
	public void modAa() {
		System.out.println("이곳은 Bb클래스의 modAa메소드 입니다.");  //Aa클래스에 있는 것을 오버라이딩
	}
}
