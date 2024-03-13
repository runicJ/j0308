package t10_abstractEx;

@SuppressWarnings("unused")
public abstract class Bonsa {  // extends object(모든 클래스의 최상위 객체) 생략
	public String shopName;  // setter가 없으므로 public으로 바꿈
	public int kimchi;  // alt + shift + a 단어 일괄 변경
	public int budae;
	public int bibim;
	public int sundae;
	public int gonggi;
	
	public Bonsa(String shopName, int kimchi, int budae, int bibim, int sundae, int gonggi) {  // setter가 아니라 생성자를 이용해서 값을 넣음
		// super();  // extends object(모든 클래스의 최상위 객체)
		this.shopName = shopName;
		this.kimchi = kimchi;
		this.budae = budae;
		this.bibim = bibim;
		this.sundae = sundae;
		this.gonggi = gonggi;
	}
	
	public abstract void kimchi();
	public abstract void budae();
	public abstract void bibim();
	public abstract void sundae();
	public abstract void gonggi();
	
	public void getShopName() {  // 일반메소드
		System.out.println("점포명 : " + shopName);  // 유효성
	}
}
