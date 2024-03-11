package t11_interface7;

interface Aa2 {  // 같은 패키지안 같은 이름의 클래스 존재x
	static void abc() {
		System.out.println("여기는 Aa2인터페이스의 정적메소드 abc()이다.");
	}
}

public class Test3Run {
	public static void main(String[] args) {  //static은 객체 생성x class이름.
		// 정적 메소드 호출
		Aa2.abc();
	}
}
