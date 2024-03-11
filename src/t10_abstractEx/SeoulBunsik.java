package t10_abstractEx;

public class SeoulBunsik extends Bonsa {

//	public SeoulBunsik(String shopName, int kimchi, int budae, int bibim, int sundae, int gonggi) {  // 외부에서 값을 넣으면 Bonsa에 있는 class가 값을 가져가야 함
//		super(shopName, kimchi, budae, bibim, sundae, gonggi);  // 원래 이렇게 하고 DB에서 값을 가져옴(배열로도)
//	}
	public SeoulBunsik() {
		super("서울분식", 5000, 5000, 5000, 4000, 0);  // 생성자를 통해서 Bonsa에 저장됨
	}

	@Override
	public void kimchi() {
		System.out.println("김치찌개 : " + kimchi);  // 접근제한자 때문에 못 가져와서 Bonsa 필드 private을 public으로 고침
	}

	@Override
	public void budae() {
		System.out.println("부대찌개 : " + budae);
	}

	@Override
	public void bibim() {
		System.out.println("비빔밥 : " + bibim);
	}

	@Override
	public void sundae() {
		System.out.println("순대국 : " + sundae);
	}

	@Override
	public void gonggi() {
		System.out.println("공기밥 : " + gonggi);
	}

}
