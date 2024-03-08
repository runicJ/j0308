package t3_override;

public class Run {
	public static void main(String[] args) {
		Cc cc = new Cc();
		
		cc.areaCircle(50);  // 오버라이드(부모 메소드를 자식이 재정의해서 사용) 오버로딩(선언부, 리턴타입 관계없음)과 차이  // 반지름 50인 원넓이는? 7850.0
	}
}
