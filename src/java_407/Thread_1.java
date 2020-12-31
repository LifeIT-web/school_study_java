package java_407;

class Thread_Exe extends Thread
{
	public void run()
	{
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000); // sleep은 예외처리 필수 / 1000 은 1초 밀리세컨드
				System.out.println(i + " 번 : " + i + " * " +
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
		
		
//		thread.run(); // 메소드 호출
		thread.start(); // 스레드 호출 => 차이점은 멀티스레드 참고
	}
}
