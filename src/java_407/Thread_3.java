package java_407;

class Thread_Exe_3 extends Thread
{
	public Thread_Exe_3(String str) {
		super(str); //  String의 값을 받는 생성자를 가져다 쓸수 있다. 오버로딩
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000); // sleep은 static , 그냥 쓸수 있다. Thread.sleep
				System.out.println(i + " 번 " + getName() + " 쓰레드"); //* Thread.getName() static이 아니라서 에러 *
												// Thread클래스 안에 있는 메소드을 가져다 쓴것 따라서 객체가 만들어져야 쓸수 있다.
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}


public class Thread_3 {

	public static void main(String[] args) {
		
		Thread_Exe_3 obj1 = new Thread_Exe_3("첫 번째");
		Thread_Exe_3 obj2 = new Thread_Exe_3("두두 번째");
		Thread_Exe_3 obj3 = new Thread_Exe_3("세세세 번째");
		Thread_Exe_3 obj4 = new Thread_Exe_3("네네네네 번째");
		Thread_Exe_3 obj5 = new Thread_Exe_3("다다다다다 번째");
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
	}
}
