package sec01;

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1)---------------------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		// 2) audio1을 킨다.
		System.out.println("2)---------------------------");
		MyClass myClass2 = new MyClass(new Audio());
	
		// 3) audio2를 킨다
		System.out.println("3)---------------------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		// 4) tv3을 킨다
		System.out.println("4)----------------------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}
