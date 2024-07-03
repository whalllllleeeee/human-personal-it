package sec02;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 hankooktire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 hankooktire로 교체");
				car.frontLeftTire = new HankookTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 hankooktire로 교체");
				car.frontLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 hankooktire로 교체");
				car.frontLeftTire = new HankookTire("뒤오른쪽", 17);
			}
			System.out.println("----------------------------------");
		}
	}
}
