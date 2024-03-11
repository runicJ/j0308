package t10_abstractEx;

public class BunsikRun {
	public static void main(String[] args) {
		WangJaBunsik wangJaBunsik = new WangJaBunsik();  // 생성자를 통해 들어간 왕자분식 타이틀 호출하면서 왕자분식에서 값이 들어감
		wangJaBunsik.getShopName();
		wangJaBunsik.kimchi();  //메소드를 통해 호출
		wangJaBunsik.budae();
		wangJaBunsik.bibim();
		wangJaBunsik.sundae();
		wangJaBunsik.gonggi();
		System.out.println("=============================================");
		
		SeoulBunsik seoulBunsik = new SeoulBunsik();
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibim();
		seoulBunsik.sundae();
		seoulBunsik.gonggi();
		System.out.println("=============================================");
		
		WooJuBunsik wooJuBunsik = new WooJuBunsik();
		wooJuBunsik.getShopName();
		wooJuBunsik.kimchi();
		wooJuBunsik.budae();
		wooJuBunsik.bibim();
		wooJuBunsik.sundae();
		wooJuBunsik.gonggi();
		System.out.println("=============================================");
	}
}
