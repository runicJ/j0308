package t11_interface2;

public class AudioRun {
	public static void main(String[] args) {  // 추상클래스, 인터페이스 생성x  // 구현객체 사용
		Audio audio = new Audio();
		
		System.out.println("Audio 최대 볼륨 : " + audio.MAX_VOLUME);  // private이 아니라서 읽는건 가능, 쓰는건x
		System.out.println("Audio 최소 볼륨 : " + audio.MIN_VOLUME);
		System.out.println();
		
		audio.switchOn();
		audio.remoteName("Audio");
		audio.switchOff();
	}
}
