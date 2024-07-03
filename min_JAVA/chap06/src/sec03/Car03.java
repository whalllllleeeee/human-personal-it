package sec03;

public class Car03 {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car03(){
	}
	
	Car03(String model){
		this(model, null, 0);
	}
	
	Car03(String model, String color){
		this(model, color, 240);
	}
	
	Car03(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
