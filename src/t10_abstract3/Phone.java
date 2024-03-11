package t10_abstract3;

public abstract class Phone {  // 추상클래스(실행할 내용x) 일반메소드 포함 가능
	private String name;
	
	public Phone(String name) {
		this.name = name;  // 외부에서 받은걸 필드에 저장
	}
	
	// 추상메소드
	public abstract void function();
	public abstract void sound();
	
	// 일반메소드
	public void powerOn() {
		System.out.println(name + "님의 전화기 전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println(name + "님의 전화기 전원을 끕니다.");
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}  //필요없음  // 생성자로 보내서
	
	public void functionSamsung() {}
	public void functionLg() {}

}
