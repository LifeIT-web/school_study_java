package java_407;

class Thread_Exe extends Thread
{
	public void run()
	{
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000); // sleep�� ����ó�� �ʼ� / 1000 �� 1�� �и�������
				System.out.println(i + " �� : " + i + " * " +
										i + " = " + (i * i));
				
			}
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
			
		}
	}
}


public class Thread_1 {

	public static void main(String[] args) {
		
		Thread_Exe thread = new Thread_Exe();
		
		
//		thread.run(); // �޼ҵ� ȣ��
		thread.start(); // ������ ȣ�� => �������� ��Ƽ������ ����
	}
}
