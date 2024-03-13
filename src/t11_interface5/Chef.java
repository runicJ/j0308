package t11_interface5;

public class Chef implements Action {  // 구현객체

	@Override
	public void catching() {}

	@Override
	public void search() {}

	@Override
	public void fire() {}

	@Override
	public void save() {}

	@Override
	public void pizza() {
		System.out.println("피자를 만듭니다.");
	}

	@Override
	public void spagetti() {
		System.out.println("스파게티를 만듭니다.");
	}

//	@Override
//	public void action(String action) {
//		System.out.println(action + " 역할? ");
//	}

}
