package java_ex_1;

public interface hireIdea {

//	public void turnOn();
//	public void turnOff();
	
	default void setMute(boolean mute) {
		
		if(mute) {
			System.out.println("무음 처리함");
		}
		else{
			System.out.println("무음 해제");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
