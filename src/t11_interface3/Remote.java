package t11_interface3;

public interface Remote {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public abstract void switchOn(String name);  // 제품명을 받아서 사용
	void switchOff(String name);
	
	void remoteName(String name);
	void setVolume(int volume);
}
