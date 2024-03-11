package t10_abstractEx;

public class BunsikRun2 {
	public static void main(String[] args) {
//		WangJaBunsik wangJaBunsik = new WangJaBunsik();  // 공통 본사를 상속받고 있다
//		SeoulBunsik seoulBunsik = new SeoulBunsik();
//		WooJuBunsik wooJuBunsik = new WooJuBunsik();
		
//		Bonsa wangJaBunsik = new WangJaBunsik();  // 업 캐스팅(타입변환)
//		Bonsa seoulBunsik = new SeoulBunsik();
//		Bonsa wooJuBunsik = new WooJuBunsik();
		
//		Bonsa[] bonsas = {wangJaBunsik, seoulBunsik, wooJuBunsik};  // 클래스를 배열(성격이 같아야 함)로 묶음(반복문 돌릴 수 있음)
		
		Bonsa[] bonsas = {new WangJaBunsik(), new SeoulBunsik(), new WooJuBunsik()};
		
		for(int i=0; i<bonsas.length; i++) {
			bonsas[i].getShopName();
			bonsas[i].kimchi();
			bonsas[i].budae();
			bonsas[i].bibim();
			bonsas[i].sundae();
			bonsas[i].gonggi();
			System.out.println("=============================================");
		}
		
		/*
		wangJaBunsik.kimchi();
		wangJaBunsik.budae();
		wangJaBunsik.bibim();
		wangJaBunsik.sundae();
		wangJaBunsik.gonggi();
		System.out.println("=============================================");
		
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibim();
		seoulBunsik.sundae();
		seoulBunsik.gonggi();
		System.out.println("=============================================");
		
		wooJuBunsik.getShopName();
		wooJuBunsik.kimchi();
		wooJuBunsik.budae();
		wooJuBunsik.bibim();
		wooJuBunsik.sundae();
		wooJuBunsik.gonggi();
		System.out.println("=============================================");
		*/
	}
}
// 추상클래스 - 상속받아서 씀(부모클래스 것 그대로- 타입변환 다형성에 의해 부모 클래스로 타입변환 가능), 재정의