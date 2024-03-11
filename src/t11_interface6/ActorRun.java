package t11_interface6;

import java.util.Scanner;

public class ActorRun {
	public static void main(String[] args) {
		Actor actor = new Actor();
		
		actor.catching();
		actor.search();
		actor.fire();
		actor.save();
		actor.pizza();
		actor.spagetti();
		System.out.println("===========================");
		
		Scanner sc = new Scanner(System.in);
		String[] titles = {"경찰관", "소방관", "요리사"};
		int choice;
		
		while(true) {
			System.out.println("어떤 배역의 역할이 궁금하십니까? ");
			System.out.print("1.경찰관 2.소방관 3.요리사 0.종료 ==> ");
			choice = sc.nextInt();
			
			if(choice < 1 || choice > 3) {
				if(choice == 0) break;
				System.out.println("1, 2, 3번의 배역만 역할 조회가 가능합니다.");
				continue;
			}
			
			// 각각의 역할을 출력...
			System.out.println(titles[choice-1] + "의 역할은?");
			switch(choice) {
				case 1:
					actor.catching();
					actor.search();
					break;
				case 2:
					actor.fire();
					actor.save();
					break;
				case 3:
					actor.pizza();
					actor.spagetti();
					break;
			}
			System.out.println("-----------------------------------");
		}
		System.out.println("===================================");
		System.out.println("각 배우의 역할을 충분히 연습해 오세요.");
		
		sc.close();
	}
}
