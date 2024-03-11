package t11_interface1;

public class Seoul implements Test1{  // interface Test1을 상속받아서 사용하는 구현체  // extends Test1하면 에러(abstract가 아니라서)
	int max;

	@Override
	public void date() {
		System.out.println("이곳은 Seoul클래스의 data메소드");
	}

	@Override
	public void datat2() {
		System.out.println("이곳은 Seoul클래스의 data2메소드");		
	}  // 인터페이스에 실제 내용 넣겠다 = 구현클래스 (실체)

	@Override
	public void date1(int su) {
		if(su > MAX) max = su;
		else max = MAX;
		System.out.println("최대값 : " + max);
	}

}
