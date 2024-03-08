package t3_override;

public class Cc extends Aa {
	
	// 원넓이(부모 것을 가져와서 내걸로 재정의해서 사용)
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? " + area);
//	}
	
//	public void areaCircle(int r) {  // 부모 것을 그대로 가져와서 사용 => 선언부를 고치지 않은 것  // 내용을 아무것도 안바꿔도 오버라이딩
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이는? " + area);
//	}
//선언부(선언부가 완전히 같아야함)에 리턴타입(int, double 같은)도 같아야 함(오버라이딩 위반) // 오버로딩 위반으로 에러
	public void areaCircle2(int r) {  // 사용자가 만든 메소드  // 오버라이딩x
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이는? " + area);
	}
	
}
