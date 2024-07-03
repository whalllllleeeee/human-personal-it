package sec01;

public interface RemoteControl {
	// 상수(변하지 않는 수)
	int MAX_VOLUME = 10;	// public final static 상수
	int MIN_VOLUME = 0;		// public final static 상수
	
	// 생성자가 없다
	
	// 추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
