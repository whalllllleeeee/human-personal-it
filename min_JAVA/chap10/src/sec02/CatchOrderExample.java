package sec02;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1); // 문자로 된 숫자를 진짜 숫자로 변환
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다");
		}catch(Exception e) {			// 해당 Exception문은 상위에 놓을 수가 없다
			System.out.println("실행에 문제가 있씁니다");
		}finally{
			System.out.println("다시 실행하세요");
		}
	}
}
