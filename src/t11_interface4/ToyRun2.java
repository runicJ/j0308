package t11_interface4;

import java.util.Scanner;

/*
	기능		곰돌이		로보트		비행기		탱크
 움직임			O				O				X			 O
 레이저			X				X				O			 O
 미사일			X				O				O			 O
  연령		전연령		  4~		 	8~	 13세이상
  
	장난감 목록을 표시해 주고, 해당 장난감의 기능을 보여주세요?
	
  어떤 장난감 구매를 희망하십니까?
  1.곰돌이  2.로보트  3.비행기  4.탱크  0.종료 ==> 1
  곰돌이는 팔/다리를 움직일수 있습니다.
  모든 연령대가 다 사용하실수 있습니다.
  
  구매를 희망하십니까?(Y/N) ==> Y
  곰돌이 구매가 확정되었습니다.
  
  구매를 희망하십니까?(Y/N) ==> N
  다음에 또 이용해 주세요. 감사합니다.
*/
public class ToyRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Toy[] toys = {new Bear(), new Robot(), new AirPlane(), new Tank()};
		String[] titles = {"곰돌이", "로보트", "비행기", "탱크"};
		
		
		while(true) {
			System.out.println("\n어떤 장난감 구매를 희망하십니까?");
			System.out.print("1.곰돌이 2.로보트 3.비행기 4.탱크 0.종료 ==> ");
			int opt = sc.nextInt();
			
			if(opt == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.println("* 장난감 : " + titles[opt-1] + " *");
			toys[opt-1].age();
			toys[opt-1].moving();
			toys[opt-1].fire();
			toys[opt-1].missaile();
			System.out.println();
			//break;
			System.out.print("구매를 희망하십니까?(Y/N) ==> ");
			String yn = sc.next().toUpperCase();
			
			if(yn.equals("N")) {
				System.out.print("다음에 또 이용해 주세요");
				break;
			}
			else System.out.println(titles[opt-1] + " 구매가 확정되었습니다.");
		}		
//		System.out.print("구매를 희망하십니까?(Y/N) ==> ");
//		String yn = sc.next().toUpperCase();
//		
//		if(yn.equals("N")) {
//			System.out.print("다음에 또 이용해 주세요");
//		}
//		else if(yn.equals("Y")) {
//			System.out.println(titles[opt-1] + " 구매가 확정되었습니다.");
//		}
//		else {
//			System.out.println("Y/N 중 하나를 입력해 주세요.");
//		}
		System.out.println("\n감사합니다.");
		sc.close();
	}
}
