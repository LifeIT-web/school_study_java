package java_407;

class Thread_Exe_4 extends Thread
{
	public Thread_Exe_4(String name) {
		super(name);
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " 스레드~~~~!");
		}
	}
}

public class Thread_4 {

	public static void main(String[] args) {
		
		Thread_Exe_4 obj1 = new Thread_Exe_4("최고  우선 순위");
		Thread_Exe_4 obj2 = new Thread_Exe_4("보통통  우선 순위");
		Thread_Exe_4 obj3 = new Thread_Exe_4("최저저저  우선 순위");
		
		obj1.setPriority(Thread.MAX_PRIORITY); // ()상수가 들어갈수 있다 MAX = 10 ctrl누른 상태에서 마우스 클릭
		obj2.setPriority(Thread.NORM_PRIORITY);// NORM = 5
		obj3.setPriority(Thread.MIN_PRIORITY);// MIN = 1
		
		obj3.start();
		obj2.start();
		obj1.start(); //  나중에 호출하더라도 우선순위가 높기 때문에 먼저 나올 확률이 높아진다.
	}
}
