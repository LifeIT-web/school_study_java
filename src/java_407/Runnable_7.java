package java_407;

import javax.swing.JOptionPane;



public class Runnable_7 {

	public static void main(String[] args) throws Exception {
		
		Runnable_7_Exe obj = new Runnable_7_Exe();
		
		Thread thread = new Thread(obj);
		
		thread.start();
		String input = JOptionPane.showInputDialog("���� �Է��ϻ�� > ");
		System.out.println("�Է��� �� : " + input + " �Դϴ�.");
	}
}

class Runnable_7_Exe implements Runnable
{

	@Override
	public void run() {
		
		try {
			for (int i = 10; i > 0; i--) {
				Thread.sleep(1000);
				System.out.println("\t\t" + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


