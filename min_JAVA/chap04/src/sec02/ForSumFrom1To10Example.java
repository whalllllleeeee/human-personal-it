package sec02;

public class ForSumFrom1To10Example {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		int i = 1;
		for(; i<= 100; i++) {	//초기화 식을 생략해도 오류가 나지 않는다.
			
		}
		for (int j = 0, k = 100; j <= 50 && k >= 50; j++, k--) {
			// 초기화식, 조건식, 증감식을 여러 개 쓸수있다 (잘 사용되지 않음)
			
		}
	}
}
