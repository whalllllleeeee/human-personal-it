package sec02;

public class ChileExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;		// 클래스 자동 형변환;
		parent.method1();
		parent.method2();	// parent의 method2가 아니라 child의 method2가 실행됨
//		parent.method3();	// error code
		
	}
}
