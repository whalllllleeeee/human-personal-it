package sec03;

public class Car02Emample {
	public static void main(String[] args) {
		
		Car02 car1 = new Car02();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car02 car2 = new Car02("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car02 car3 = new Car02("자가용", "빨강");
		System.out.println("car3.company : " + car2.company);
		System.out.println("car3.model : " + car2.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car02 car4 = new Car02("택시", "검정", 200);
		System.out.println("car3.company : " + car2.company);
		System.out.println("car3.model : " + car2.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
	}
}
