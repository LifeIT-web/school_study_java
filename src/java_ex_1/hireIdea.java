package java_ex_1;

public interface hireIdea {

//	public void turnOn();
//	public void turnOff();
	
	default void setMute(boolean mute) {
		
		if(mute) {
			System.out.println("���� ó����");
		}
		else{
			System.out.println("���� ����");
		}
	}
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
