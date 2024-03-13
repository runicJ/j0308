package t11_interfaceEx;

public class Child implements Menu {
	private int total = BASIC_PRICE;
	
	@Override
	public void foodCalcPrint() {
		int sw = 0;
		System.out.println("============================");
		System.out.println("기본제공 : 쌀밥\t 불고기");
		System.out.println("선택간식 : ");
		for(int i=0; i<CHOICE_FOOD.length; i++) {
			if(CHOICE_FOOD[i] != null) {
				System.out.println(CHOICE_FOOD[i] + "\t");
				sw = 1;
			}
		}
		if(sw == 0) System.out.println("선택간식없음");
		System.out.println();
		System.out.println("총 식대 : " + String.format("%d", total) + "원");
		System.out.println("============================");
	}

	@Override
	public void foodCalc(int i) {
		total += PRICE[i];
		CHOICE_FOOD[i] = FOOD[i];
	}

}
