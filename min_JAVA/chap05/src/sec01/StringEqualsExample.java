package sec01;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";		// String은 참조차입(reference type)
		String strVar2 = "신민철";
		
		
		if(strVar1 == strVar2) {
			System.out.println("strvar1과 strvar2는 참조가 같음");
		}else {
			System.out.println("strvar1과 strvar2는 참조가 다름");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");

		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		if(strVar1 == strVar3) {
			System.out.println("strVar1과 strVar3는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar3는 참조가 다름");
		}
		
		// 참조 타입의 변수들은 모두 null이란 걸 가진다.
		String str = "";
		System.out.println("총 문자수 : " + str.length());
		// 기본 타입(primitive type)은 null을 가질 수 없다.
		//int intValue1 = null;
	}
}

















