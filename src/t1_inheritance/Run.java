package t1_inheritance;

public class Run {
	public static void main(String[] args) {
		A a = new A();
		System.out.print("1. ");
		a.areaRec(10, 20);  // 원래대로 메소드 부를때
	
		B b = new B();  // B만 생성해서 A것도 같이 사용
		System.out.print("2. ");
		b.areaRec(20, 30);  // 부모메소드, item1 안보임, - 클래스
	
		C c = new C();
		System.out.print("3. ");  // 상속 협업 중요성
		c.areaRec(30, 40);
		
		D d = new D();
		System.out.print("4. ");
		d.areaRec(40, 50);
		
		E e = new E();
		System.out.print("5. ");
		d.areaRec(50, 60);
		System.out.println();
		
		b.areaPoly(10, 20, 5);
		d.areaPoly(10, 20, 5);  // B와 A 상속 가능
	}
}
