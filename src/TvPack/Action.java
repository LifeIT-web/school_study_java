package TvPack;

public class Action extends Name implements Skills{

	@Override
	public void turnOff() {
		System.out.println("������ �������ϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("������ �������ϴ�.");
	}

	@Override
	public void ChannelUp() {
		System.out.println("ä���� �ø��ϴ�.");
		++channel;
	}

	@Override
	public void ChannelDown() {
		System.out.println("ä���� �����ϴ�.");
		--channel;
	}

	@Override
	public void display(String text) {
		System.out.println(text);
	}

	
	}
	
	
