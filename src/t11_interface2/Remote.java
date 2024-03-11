package t11_interface2;

public interface Remote {
	public static final int MAX_VOLUME = 10;  // 상수(값을 못바꿈)
	int MIN_VOLUME = 0;  // public static final 인터페이스의 필드는 자동생략가능
	
	public abstract void switchOn();  // 추상메소드
	void switchOff();  // public abstract 생략가능
	
	void remoteName(String name);
}
