package 과제;

public class Parent2 {
	public String nation;
	
	public Parent2() {
		this("대한민국");
		System.out.println(this.nation);
	}
	
	public Parent2(String nation) {
		this.nation = nation;
	}
}
