package 과제;

public class Child2 extends Parent2{
	private String name;

	public Child2() {
		setName("홍길동");
		System.out.println(getName());
	}
	
	public Child2(String name, String nation) {
		this.name = name;
		System.out.println(name+"님의 국적은 "+nation+"입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
