package sec02;

public class KumhoTire extends Tire{
	// 1개의 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "kumho tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			
			return true;
		}else {
			System.out.println("*** " + location + " kumho Tire 펑크 ***");
			return false;
		}
	}
}

	

	
