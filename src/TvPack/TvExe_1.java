package TvPack;

import java.util.Scanner;

public class TvExe_1 {

	public static void main(String[] args) {
		

		Action obj = new Action();
		
		Scanner in = new Scanner(System.in);
		
		obj.display("���� On?(0) Off?(10)");
		
		int power = in.nextInt();
		
		next:{
			if(power == 0)
			{
				obj.turnOn();
				
				while(true)
				{
					obj.display("��� �����ðڽ��ϱ�?");
					obj.display("1. KBS 2. SBS 3. MBC 0. ��");
					int channel = in.nextInt();
					
					if (channel > 0 && channel < 4) {
						
						if (channel == 1) {
							obj.display("KBS");
							obj.display("ä�� �ø��ڽ��ϱ�? 0. �� 1. �ƴϿ�");
							int confirm = in.nextInt();
							
							if (confirm == 0) {
								obj.ChannelUp();
								obj.display("SBS");
							}
						}
						else if (channel == 2) {
							obj.display("SBS");
							obj.display("�÷�? 0");
							obj.display(" ����? 1");
							obj.display(" �ϱ� �Ⱦ� 2");
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
							obj.display("ä�� �����ڽ��ϱ�? 0. �� 1. �ƴϿ�");
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
						obj.display("�߸� �����˽��ϴ�.");
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
