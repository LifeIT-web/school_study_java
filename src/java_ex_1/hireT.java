package java_ex_1;

class hire implements hireIdea{

	
	private boolean mute;
	
	@Override
	public void setMute(boolean mute) {

		this.mute = mute;
		
		if(mute) {
			System.out.println("���� ó����");
		}
		else{
			System.out.println("���� ����");
		}
		
	}

	
}

public class hireT{
	public static void main(String[] args) {
		hire h = new hire();
		
		h.setMute(false);
		
		hireIdea.changeBattery();
	}
}
