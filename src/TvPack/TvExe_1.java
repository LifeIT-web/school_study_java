package TvPack;

import java.util.Scanner;

public class TvExe_1 {

	public static void main(String[] args) {
		

		Action obj = new Action();
		
		Scanner in = new Scanner(System.in);
		
		obj.display("전원 On?(0) Off?(10)");
		
		int power = in.nextInt();
		
		next:{
			if(power == 0)
			{
				obj.turnOn();
				
				while(true)
				{
					obj.display("몇번 누르시겠습니까?");
					obj.display("1. KBS 2. SBS 3. MBC 0. 꺼");
					int channel = in.nextInt();
					
					if (channel > 0 && channel < 4) {
						
						if (channel == 1) {
							obj.display("KBS");
							obj.display("채널 올리겠습니까? 0. 네 1. 아니오");
							int confirm = in.nextInt();
							
							if (confirm == 0) {
								obj.ChannelUp();
								obj.display("SBS");
							}
						}
						else if (channel == 2) {
							obj.display("SBS");
							obj.display("올려? 0");
							obj.display(" 내려? 1");
							obj.display(" 하기 싫어 2");
							int confirm = in.nextInt();
							
							if (confirm == 0) {
								obj.ChannelUp();
								obj.display("MBC");
							}
							else if (confirm == 1) {
								obj.ChannelDown();
								obj.display("KBS");
							}
							
							
						}
						else if (channel == 3) {
							obj.display("MBC");
							obj.display("채널 내리겠습니까? 0. 네 1. 아니오");
							int confirm = in.nextInt();
							
							if (confirm == 0) {
								obj.ChannelDown();
								obj.display("SBS");
							}
							
						}	
						
						
					}
					else if(channel == 0)
					{
						obj.turnOff();
						break next;
					}
					
					else
					{
						obj.display("잘못 누르셧습니다.");
					}
						
				}
			}
			else if(power == 10)
			{
				obj.turnOff();
				break next;
			}
		}
	}
}
