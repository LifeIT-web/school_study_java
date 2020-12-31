package java_ex_1;

class hire implements hireIdea{

	
	private boolean mute;
	
	@Override
	public void setMute(boolean mute) {

		this.mute = mute;
		
		if(mute) {
			System.out.println("公澜 贸府窃");
		}
		else{
			System.out.println("公澜 秦力");
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
