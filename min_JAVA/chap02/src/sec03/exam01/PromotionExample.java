package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		char charValue1 = 'A';
		int intValue = charValue1;
		
		byte byteValue = 65;
		char charValue2 = byteValue;	// 컴파일 에러
		*/
		
		//자동 타입 변환
		/*
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;;
		System.out.println("longValue: " + longValue);	
		
		longValue = 100;
		float floatValue = longValue; 
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		*/
		
		// --------------------------------------------------------------------
		// 강제타입 변환
		/*
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		*/
		// --------------------------------------------------------------------
		
		/*
		// --------------------------------------------------------------------
		// 정수 연산에서의 자동타입 변환(byte 예제)
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
		// --------------------------------------------------------------------
		// --------------------------------------------------------------------
		// 정수 연산에서의 자동타입 변환(long 예제)
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
		// --------------------------------------------------------------------
		*/
		
		/*
		// --------------------------------------------------------------------
		// 실수에서의 자동타입 변환 관련 예제
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;   //컴파일 에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;   //컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // 10 / 4 = 2.5 -> 2
		System.out.println(intValue4); // 2
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;   //컴파일 에러
		double doubleValue = intValue5 / 4.0;   // 10 / 4.0 -> 10.0 / 4.0 = 2.5
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y; // x -> double 캐스팅(casting). 그래서 y도 double 타입으로 자동변환됨 1.0 / 2 -> 1.0 / 2.0 -> 0.5
		System.out.println(result);
		// --------------------------------------------------------------------
		*/
		
		// --------------------------------------------------------------------
		// '+'연산에서의 문자열 자동 타입 변환 예제
		//숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		//결합 연산
		String str1 = 10 + 2 + "8"; // (10 + 2) -> 12 -> "12" + "8" -> 128
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8; // "10" + "2" + "8" -> 1028
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8; // "10" + "2" + "8" -> 1028
		System.out.println("str3: " + str3);
		
		String str4 = "10" + (2 + 8); // (2 + 8) -> 10 -> "10" + "10" -> 1010
		System.out.println("str4: " + str4);
		// --------------------------------------------------------------------
		
		// --------------------------------------------------------------------
		// 문자열을 기본 타입으로 강제 타입 변환 예제
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");  // true <-> "true"
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str12 = String.valueOf(10);
		String str22 = String.valueOf(3.14);
		String str32 = String.valueOf(true);		
		
		System.out.println("str12: " + str12);
		System.out.println("str22: " + str22);
		System.out.println("str32: " + str32);
		// --------------------------------------------------------------------
		
		byte a1 = 10;
		char b1 = 'A'; // 65500
		
		//short shrotValue10 = b1;  // -32,000
		
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		
		// 2 + 1 + 2 + 3 = 8    0.8 + 0.5 + 0.9 = 2.2  -> 0.8 + 0.5 = 1.3    0.8 + 0.9 = 1.7   0.5 + 0.9 = 1.4
	}
}
