package t11_interface5;

public class FireMan implements Action {

	@Override
	public void catching() {}

	@Override
	public void search() {}

	@Override
	public void fire() {
		System.out.println("화재를 진압합니다.");
	}

	@Override
	public void save() {
		System.out.println("인명구조를 합니다.");
	}

	@Override
	public void pizza() {}

	@Override
	public void spagetti() {}

//	@Override
//	public void action(String action) {
//		System.out.println(action + " 역할? ");
//	}

}
