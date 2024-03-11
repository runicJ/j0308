package t11_interface5;

/*
	각 배우의 역할 출력하기?
	배역 : 경찰관(범인잡기, 물건찾기), 소방관(불끄기, 인명구조), 요리사(피자, 스파게티 요리)
 */
public class ActionRun {
	public static void main(String[] args) {
		System.out.println("* 각 역할극의 메뉴얼 리스트 *");
		System.out.println();
		
		String[] actor = {"경찰관", "소방관", "요리사"};
		Action[] actions = {new PoliceMan(), new FireMan(), new Chef()};
		
		for(int i=0; i<actions.length; i++) {
			actions[i].action(actor[i]);
			actions[i].catching();
			actions[i].search();
			actions[i].fire();
			actions[i].save();
			actions[i].pizza();
			actions[i].spagetti();
			System.out.println();
		}
	}
}
