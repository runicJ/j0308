package t2_inheritance;

public class Run {
	public static void main(String[] args) {  // 메소드 동작부  //main 클래스 main 스레드(독립적으로 일하는 얘)  //하나의 스레드 순차실행 //여러개 스레드 각각 실행(경마)
		System.out.println("1. 이곳은 Run클래스 입니다.");
		
		Bb bb1 = new Bb();
		bb1.areaRec(10, 20);
		bb1.areaPoly(1, 2, 3);
		System.out.println();
		
		Bb bb2 = new Bb(10);  // 생성자는 지정한 것만 불러올수 있으므로 매개변수 같은것만 불러올수 있음(기본x) . 메소드는 다 불러올수 있음 // Aa도 생성이 됨. Aa(기본생성자만 실행)가 먼저 생성되고 Bb가 나옴. ()매개변수 안넣었을때 기본생성자.  //사용자 정의 생성자만 있으면 기본생성자 자동으로 생성 안되어 있을테니 에러
		bb2.areaPoly(2, 3, 4);  // 같은 클래스에 있으니까 생성자(기본이든 뭐든) 안 메소드, 필드 다 사용가능
		System.out.println();
		
		Bb bb3 = new Bb(10, 20, 30);  // Bb를 통해서 Aa를 구함.
		System.out.println();
		
		System.out.println("2. 이곳은 Run클래스 입니다.");
	}
}
