package t4_override;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa();  // final을 붙이면 생성은 되나 상속이 안됨.
		
		Cc cc = new Cc();
		
		//cc.areaCircle(50);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.신라 2.백제? ");
		int ans = sc.nextInt();
		System.out.print("반지름? ");
		int r = sc.nextInt();
		
		if(ans == 1) cc.areaCircle(r);
		else if(ans == 2) cc.areaCircle2(r);
		else System.out.println("코드를 확인 후 다시 처리해주세요.");
		
		sc.close();
	}
}
