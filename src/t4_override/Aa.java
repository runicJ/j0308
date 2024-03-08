package t4_override;

//public final class Aa {
public class Aa {  // private은 완전 폐쇄
	private int item1 = 500;
	int item2 = 600;

	// 사각형의 면적
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적(가로: "+x+", 세로: "+y+") : " + area);  // return
	}
	
	// 원넓이
	//public final void areaCircle(int r) {  // final을 사용하면 메소드를 오버라이드(재정의)해서 사용할 수 없다.(필드에 final 넣으면 값 못바꿈)
	public void areaCircle(int r) {
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이는? " + area);
	}
}
