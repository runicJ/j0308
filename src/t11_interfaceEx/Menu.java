package t11_interfaceEx;

public interface Menu {
	String[] FOOD = {"두부조림","미역국","요플레","바나나","우유","아몬드"};
	int[] PRICE = {1000,1000,800,500,500,700};
	String[] CHOICE_FOOD = new String[FOOD.length]; // 필드는 무조건 초기값을 가짐
	int BASIC_PRICE = 2500;  // 쌀밥 + 불고기
	
	void foodCalcPrint();
	
	void foodCalc(int i);
	//TOTAL_PRICE += PRICE[i];
	default void lunchCalc(int i) {
		foodCalc(i);
	};
}
