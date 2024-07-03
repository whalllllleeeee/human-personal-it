package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// setter메소드 호출
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed()); //-50
		
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed()); //60
		
		// 멈추는 코드
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed()); //0
	}

}
