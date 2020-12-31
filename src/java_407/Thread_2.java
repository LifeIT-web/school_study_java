package java_407;

class Thread_Exe_2 extends Thread
{
	public void run() {
		
		try {
			
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				System.out.println(i + " 번 쓰레드 ~~~~~");
			}
			
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
		
		}
	}
}


public class Thread_2 {

	public static void main(String[] args) {
		
		Thread_Exe_2 thread = new Thread_Exe_2();
		
//		thread.run(); // 메소드 호출은 위에있는 run()을 실행한다음에 그다음 메인이 돈다.
		thread.start(); //  스레드 호출은 두개의 스레드를 동시에 실행시켜 출력시키는 것.
		
		try {
			
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				System.out.println( i + " 번 main() 메소드^^^");
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
// 쓰레드의 결과치는 알수 없다. 지금 메인 자체가 스레드임 즉 지금 두개의 쓰레드를 돌고있다.
