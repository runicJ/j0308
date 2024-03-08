package t4_override;

public class Cc extends Aa {
	
	//원넓이 - 오버라이딩 하면 자식이 우선
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? " + area);
//	}
	
//메소드 이름 ctrl+space
	@Override
	public void areaCircle(int r) {
		double area = r * r * Math.PI;
		System.out.println("반지름 "+r+"인 원넓이는? " + area);
	}
	
	public void areaCircle2(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? " + area);
		super.areaCircle(r);
	}
	
	
//	void areaCircle(int r) {  //접근제한자 강하게x
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? " + area);
//	}
	//@어노테이션 컴파일러와 약속된 예약어
	
//	@Override //- 틀린 곳을 찾아줌
//	public void arearec(int x, int y) {
//		
//	}
}
