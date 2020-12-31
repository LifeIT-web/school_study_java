package TvPack;

public class Action extends Name implements Skills{

	@Override
	public void turnOff() {
		System.out.println("전원이 꺼졌습니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("전원이 켜졌습니다.");
	}

	@Override
	public void ChannelUp() {
		System.out.println("채널을 올립니다.");
		++channel;
	}

	@Override
	public void ChannelDown() {
		System.out.println("채널을 내립니다.");
		--channel;
	}

	@Override
	public void display(String text) {
		System.out.println(text);
	}

	
	}
	
	
