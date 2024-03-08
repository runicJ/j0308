package t7_polymorphism;

// Down Casting(상속관계)
public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		System.out.println();
		//Bb ab = (Bb)aa;  // 부모객체를 자식객체로 바로 Down Casting할 수 없다. // 누가 상속받았는지 모르니까 업캐스팅이 먼저 일어나야 다운캐스팅 가능 //실행오류 //강제캐스팅
	
		// Down Casting은 자식객체가 부모객체로 Up Casting 하였을 경우에만 다시 Down Casting 할 수 있다.
		Aa ba = new Bb(); // Up Casting
		Bb bb = (Bb)ba;  // 자식이 부모가 된 후에 다시 자식이 되는 것 가능
		System.out.println();
		
		Bb db = new Dd();
		Dd dd = (Dd)db;
		System.out.println();
		
//		Cc ec = new Ee();
//		Ee ee = (Ee)ec;
//		System.out.println();
//		
//		Aa eca = ec;
//		Cc ecac = (Cc)eca;
		
		Aa ea = new Ee();  // 업캐스팅은 무조건 됨
		Ee eae = (Ee)ea;   // 조상객체로 타입변환이 되어 있어야 본인에게 돌아갈 수 있음.
		System.out.println();
		
		Cc eac = (Cc)ea;
	}
}
