package t11_interface2;

public class TvRun {
	public static void main(String[] args) {  // 추상클래스, 인터페이스 생성x  // 구현객체 사용
		Tv tv = new Tv();
		
		System.out.println("Tv 최대 볼륨 : " + tv.MAX_VOLUME);  // private이 아니라서 읽는건 가능, 쓰는건x
		System.out.println("Tv 최소 볼륨 : " + tv.MIN_VOLUME);
		System.out.println();
		
		tv.switchOn();
		tv.remoteName("Tv");
		tv.switchOff();
	}
}
