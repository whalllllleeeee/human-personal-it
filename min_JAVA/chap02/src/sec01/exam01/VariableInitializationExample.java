package sec01.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		//변수 value 선언하고 초기화
		int value = 20;    
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;		// 10 + 20 = 30
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
		value = 0;
		result = 1;	
	}

	int test1 = 10;
	
}
