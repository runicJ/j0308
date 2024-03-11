package t12_lunch;

import java.util.Scanner;

public class LunchRun {
	public static void main(String[] args) {
		LunchMenu child1 = new Child1();
		LunchMenu child2 = new Child1();
		
		String[] snacks = {"요플레", "바나나", "우유", "아몬드"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("간식을 선택하세요");
		int snack = sc.nextInt();
		
		while(true)	{
			for(int i=0; i<snacks.length; i++) {
				
			}
		}
	}
}
