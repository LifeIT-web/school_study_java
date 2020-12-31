package java_407;

class Thread_Exe_4 extends Thread
{
	public Thread_Exe_4(String name) {
		super(name);
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " ������~~~~!");
		}
	}
}

public class Thread_4 {

	public static void main(String[] args) {
		
		Thread_Exe_4 obj1 = new Thread_Exe_4("�ְ�  �켱 ����");
		Thread_Exe_4 obj2 = new Thread_Exe_4("������  �켱 ����");
		Thread_Exe_4 obj3 = new Thread_Exe_4("��������  �켱 ����");
		
		obj1.setPriority(Thread.MAX_PRIORITY); // ()����� ���� �ִ� MAX = 10 ctrl���� ���¿��� ���콺 Ŭ��
		obj2.setPriority(Thread.NORM_PRIORITY);// NORM = 5
		obj3.setPriority(Thread.MIN_PRIORITY);// MIN = 1
		
		obj3.start();
		obj2.start();
		obj1.start(); //  ���߿� ȣ���ϴ��� �켱������ ���� ������ ���� ���� Ȯ���� ��������.
	}
}
