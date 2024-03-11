package t12_lunch;

public class Child1 implements LunchMenu {
	int RICE;
	int BULGOGI;
	int TOFU;
	int SEA_SOUP;
	int YOGART;
	int BANANA;
	int MILK;
	int ALMOND;

	@Override
	public int basicPrice() {
		System.out.println("쌀밥과 불고기는 기본 배식입니다.");
		return RICE + BULGOGI;
	}

	@Override
	public void snackPrice() {}
}
