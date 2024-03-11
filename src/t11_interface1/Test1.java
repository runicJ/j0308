package t11_interface1;

public interface Test1 {  // Test1의 구현객체 Seoul, Busan  // ctrl 클릭(implementation) 구현부 볼 수 있음
	// int max = 1000000;  // 상수 개념
	int MAX = 1000000;  // 상수 개념
	public static final int MIN = 0;  // (static final 생략)
	
	void date();
	void date1(int su);  // 둘다 추상메소드 
	public abstract void datat2();
	
	default void data3() {   // 오버라이드
		// 실행할 내용 포함/생략
		System.out.println("이곳은 data3메소드(default)");
	}
	
	static void data4() {
		// 실험할 내용을 포함
		System.out.println("이곳은 data4메소드(static)");
	}  // 실행블록
}

// 기존 것에 새로운것