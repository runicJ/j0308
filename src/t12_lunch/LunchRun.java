package t12_lunch;

import java.util.Scanner;

public class LunchRun {
	public static void main(String[] args) {
		LunchMenu child1 = new Child1();
		LunchMenu child2 = new Child1();
		
		String[] snacks = {"요플레", "바나나", "우유", "아몬드"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("간식을 선택하세요");
		int price = 0;
		int tot = 0;
		
		while(true)	{
			System.out.println("(1.요플레 2.바나나 3.우유 4.아몬드 0.선택완료) ==>");
			int opt = sc.nextInt();
			if(opt < 0 || opt > 4) {
				if(opt == 0) break;
				System.out.println("선택 가능한 코드번호를 입력하세요.");
				continue;
			}
		}
		sc.close();
	}
}
