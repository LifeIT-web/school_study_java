package java_402;



class TV
{
	boolean power; // ����
	int channel; // ü��

	void power1()
	{
		power = !power;
	}
	void channelUp()
	{
		channel++;
	}
	void channelDown()
	{
		--channel;
	}


}

class CaptionTv extends TV
{
	boolean caption; // �μ� on & off
	
	void display(String text)
	{
		if (caption) {
			System.out.println(" text = " + text);
		}
		
	}
	
}


public class CaptionTvTest {

	public static void main(String[] args) {

		CaptionTv ctv = new CaptionTv();
			
		
		ctv.channel = 11;
		ctv.channelUp();
		ctv.channelUp();
		ctv.channelUp();

		System.out.println(ctv.channel);
		
		ctv.caption = true;
		
		ctv.display("Hello KBS ~~~~~~~~~~");
		
		ctv.display("Hello CNN ##########");
		
		ctv.channelDown();
		ctv.channelDown();
		ctv.channelDown();
		ctv.channelDown();
		ctv.channelDown();

		System.out.println(ctv.channel);
		
	}
}