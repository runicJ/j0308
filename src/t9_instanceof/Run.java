package t9_instanceof;

public class Run {
	public static void main(String[] args) {
		
		//Aa aa = new Aa(); // Bb객체 생성 부모타입으로
		Aa aa = new Bb();
		
		// aa객체가 과거에 Aa타입으롷 업캐스팅 했었는지를 알아보고 처리해야함(instanceof).
		if(aa instanceof Bb) {  // Aa로 업캐스팅이 된 적 있는지
			Bb bb = (Bb)aa;  // 한적없어도 에러x. // 참이 나오면 다운캐스팅 해라 // 강제 다운캐스팅 업으로 왔었는지 확인
			System.out.println("Down Casting성공~~");
		}
		else {
			System.out.println("Down Casting불가..");
		}
	}
}
