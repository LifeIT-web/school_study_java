package TvPack;

import java.util.Scanner;

public class TvExe {
	
	public static void main(String[] args) {
		
		Action obj = new Action();
		Skills obj2 = new Action();
		
		Scanner in = new Scanner(System.in);
		
		obj.display("���� On?(true) Off?(false)");
		boolean power = in.nextBoolean();
		
		next:{
			if(power == true)
			{
			obj.turnOn();
			{
			while (true) {
			
			obj.display("��� �����ž�?");
			obj.display("1. kbs 2. sbs 3. mbc 4. jtbc 5. tvn 0. ����");
			int channel = in.nextInt();
			
			
			
			switch (channel) {
			case 0:
				obj.turnOff();
				break next;
				
			case 1:
				obj.display("KBS~~");
				break;
				
			case 2:
				obj.display("SBS~~");
				break;
				
			case 3:
				obj.display("MBC~~");
				break;
			case 4:
				obj.display("JTBC~~");
				break;
			case 5:
				obj.display("TVN~~");
				break;
			default:
				obj.display("�߸� ������.");
				break;
			}
			
		}
	}
}
			else {
				obj.turnOff();
			}
				
}
}
}