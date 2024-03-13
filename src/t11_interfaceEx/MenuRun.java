package t11_interfaceEx;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu child = new Child();
		
		System.out.println("<원생 점심 식단표 고르기>");
		while(true) {
			int choice;
			System.out.println("아이가 먹을 간식을 선택하세요?(기본제공:쌀밥,불고기)");
			for(int i=0; i<child.FOOD.length; i++) {
				System.out.println((i+1)+"."+child.FOOD[i]+"("+child.PRICE[i]+")/");
			}
			System.out.println("0.종료 ==> ");
			choice = sc.nextInt();
			if(choice <= 0 || choice > 6) break;
			child.lunchCalc(choice-1);	// 식단계산을위한 누적메소드호출(누적만시킨다.)
			System.out.println();
		}
		child.foodCalcPrint();
		
		sc.close();
	}
}
