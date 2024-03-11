package t11_interface2;

public class Audio implements Remote {  // Remote 구현객체 Audio // class 만들때 interface 상속(add)인지 추상클래스 상속(browse)인지 확인

	@Override
	public void switchOn() {
		System.out.println("Audio 전원을 켭니다.");
	}

	@Override
	public void switchOff() {
		System.out.println("Audio 전원을 끕니다.");
	}

	@Override
	public void remoteName(String name) {
		System.out.println(name + " 리모콘");
	}

}
