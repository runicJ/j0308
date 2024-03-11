package t11_interface7;

interface Aa {  // public은 1개만(class)
	int AA = 10;  // 상수 대문자
	void abc();  // 추상메소드
}

class Bb implements Aa {

	@Override
	public void abc() {
		System.out.println("Bb클래스에 abc()메소드");
	}
	
}

class Cc implements Aa {
	
	@Override
	public void abc() {
		System.out.println("Cc클래스에 abc()메소드");
	}
	
}

public class Test1Run {
	public static void main(String[] args) {
//		Bb b1 = new Bb();
//		Bb b2 = new Bb();
//		Cc c1 = new Cc();
//		Aa c2 = new Cc();
		
		// 구현객체 생성
		Aa b1 = new Bb();
		Aa b2 = new Bb();
		Aa c1 = new Cc();
		Aa c2 = new Cc();
		
		// 구현객체 안의 메소드 호출
		b1.abc();
		b2.abc();
		c1.abc();
		c2.abc();
	}
}
