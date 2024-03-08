package 과제;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
		System.out.println("이름이 "+name+"인 학생의 수는 "+studentNo+"명 입니다.");
	}
}
