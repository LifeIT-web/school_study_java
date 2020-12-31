package java_407;

import javax.swing.JOptionPane;

public class Thread_7 {

	public static void main(String[] args) throws Exception {
		
		MyThread_1 thread_1 = new MyThread_1();
		thread_1.start();
		
		String input = JOptionPane.showInputDialog("값을 입력 하시오"); // 에러뜰때 마우스 갔다 대고  ctrl + 1
		System.out.println("입력한 값 : " + input + " 입나다");
	}
}


class MyThread_1 extends Thread
{
	public void run()
	{
		for (int i = 10; i > 0; i--) {
			
			System.out.println("\t\t" + i);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
		}
	}
}