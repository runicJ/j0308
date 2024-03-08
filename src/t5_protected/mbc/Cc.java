package t5_protected.mbc;

//import t5_protected.kbs.Aa;

//public class Cc extends Aa {
public class Cc {
	void test() {  // 상속일때 오버라이딩 - public 보다 강하면 안됨.
	//public void test() {
		int b;
		//b = 20;  // 상속관계가 아니니 Aa의 b와 관련x  // 일반 지역변수
		b = 200;
	}
}
