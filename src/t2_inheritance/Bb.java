package t2_inheritance;

public class Bb extends Aa{  // extends Aa 지우면 필드 에러(부모것 가져옴)
	int su = item1;  // Bb 클래스의 필드(정의만 하는 곳(변경x), 가져오는건 가능)가 들어가는 위치(동작에 넣어야)
	
	public Bb() {  // 기본 생성자  // super() 생략되어 있음
		System.out.println("이곳은 Bb클래스의 기본생성자");
	}
	
	public Bb(int su) {
		super(10);  //생성자에 있어야하는데 맨 첫번째에 위치 // 사용자 정의 생성자1 부름  // super 뺴면 Aa 기본생성자
		System.out.println("이곳은 Bb클래스의 사용자 정의 생성자, su = " + su);
		//super(10); // 무조건 첫번째에 있어야 함 // 부모를 보고 다 끝내고 자기껄 실행
	}
	
	public Bb(int item1, int x, int y) {  // 값을 3개 받는 생성자 만들어 놔야함
		super(item1, x, y);  // B를 통해서 Run 하고 싶을때
	}
	
//사다리꼴 면적
	public void areaPoly(int x, int y, int z) {
		int area = (x + y) * z / 2;
		System.out.println("사다리꼴의 면적(윗변: "+x+", 아랫변: "+y+", 높이: "+z+") : " + area);
// super() 부모의 기본생성자 부름		
	}
}
