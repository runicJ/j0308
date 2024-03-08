package t8_polymorphism;

public class Run {
	public static void main(String[] args) {
		Bb bb = new Bb();
		System.out.println();
		
		System.out.println("bb.su : " + bb.su);  //.su A안나옴 자식이 먼저
		bb.modBb();
		bb.modAa();  // Bb에 있는 것
		System.out.println();
		
		/* ---------- Up Casting ----------- */
		
		Aa ba = new Bb();
		ba.modAa(); // 본인 것이 안나오고 부모 것만 나옴
		System.out.println();

		/* ---------- Down Casting --------- */
		// 부모로 Up Casting이 되어 있을 경우에만 자신으로 Down Casting 할 수 있다.
		Bb bab = (Bb)ba;
		bab.modAa();  // Aa 것이 안나옴. // 자식으로서만 사용(부모 것x)  // 그냥 상속 받으면 둘다 사ㅇ
		bab.modCc();
		System.out.println();
		
		/* --------------------------------- */
		Aa ca = new Cc();
		ca.modAa();
		ca.modCc();
		ca.modHH(50, 100);
		System.out.println("ca.su : " + ca.su);
	}
}
