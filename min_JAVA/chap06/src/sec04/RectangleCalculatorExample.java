package sec04;

public class RectangleCalculatorExample {
	public static void main(String[] args) {
		
	RectangleCalculator myCalcu = new RectangleCalculator();
	
	
	// 정사각형 넓이 구하기
	double result1 = myCalcu.areaRectangle(10);
	
	// 직사각형 넓이 구하기
	double result2 = myCalcu.areaRectangle(10, 20);
	
	// 결과출력
	System.out.println("정사각형 넓이 = " + result1);
	System.out.println("직사각형 넓이 = " + result2);
	
	}
}
