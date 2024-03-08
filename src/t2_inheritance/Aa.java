package t2_inheritance;

public class Aa {
	int item1 = 500;  // default(같은 패키지)
	int item2 = 600;
	
	public Aa() {  // 기본 생성자
		System.out.println("이곳은 Aa클래스의 기본생성자");
	}
	// 생성자 상속x
	public Aa(int item1) {  // 오버로딩(개수)
		this.item1 = item1;
		System.out.println("이곳은 Aa클래스의 사용자 정의 생성자1");
	}
	
	public Aa(int item1, int x, int y) {
		this.item1 = item1;
		System.out.println("이곳은 Aa클래스의 사용자 정의 생성자2");
		areaRec(x, y);  // 부르는 애는 타입을 쓰는게 아님. 값만 
	}
	
	// 사각형의 면적
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적(가로: "+x+", 세로: "+y+") : " + area);  // return
	}
}
