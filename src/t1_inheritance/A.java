package t1_inheritance;

public class A {
	private int item1 = 500;
	int item2 = 600;
// private을 class에 붙인 것이 아니면 상속은 가능
// private 붙인 필드, 메소드는 받을 수 없음
	// 사각형의 면적 계산 메소드
	public void areaRec(int x, int y) {   // 여기서 출력하고 끝냄(리턴x)
		int area = x * y;
		System.out.println("사각형의 면적(가로: "+x+", 세로: "+y+") : " + area);  // return
	}
}
