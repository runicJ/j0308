package t11_interface7;

public class Test2Run {
	public static void main(String[] args) {
		// new Test2();  //생성x, 인터페이스를 생성하려면? 익명구현 객체를 사용해서 가능하다.
	
		// 익명구현객체에 구현할 메소드를 만들어준다.
		Test2 t22 = new Test2() {  // 로컬블록 실행블록{익명구현객체}
			int atom = 200;
			
			@Override
			public void abc() {  // Test2의 abc()와 같거나 커야함  // 구현class 따로 생성 없이 익명객체 만들어서 중괄호 안에서 재정의
				int temp = atom;
				System.out.println("이곳은 Test2Run 클래스의 t22익명객체 안의 abc()메소드 입니다.");
			}
		};
		
		Test2 t23 = new Test2() {  // t22과 다른 객체(힙메모리에 따로 생성)
			public void abc() {				
				System.out.println("이곳은 Test2Run 클래스의 t23익명객체 안의 abc()메소드 입니다.");
			}
		};
		
		// 익명객체 안에 메소드 호출하기
		t22.abc();
		// 인터페이스 변수로 익명객체안의 필드와 일반변수에 접근 불가이다.
//		System.out.println("atom : " + t22);  (x)
//		System.out.println("atom.temp : " + t22.atom().temp);
		t23.abc();
		
		if(t22 == t23) System.out.println("같은 객체를 가리킵니다.");  // 주소비교 얕은복사
		else System.out.println("서로 다른 객체를 가리킵니다.");
	}
}
