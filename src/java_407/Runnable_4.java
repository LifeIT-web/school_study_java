package java_407;

class Runnable_4_Exe implements Runnable
{
	String str = "";
	
	public Runnable_4_Exe(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str + " 스레드!!!!!!");
		}
	}
}

public class Runnable_4 {

	public static void main(String[] args) {
		
		Runnable_4_Exe obj1 = new Runnable_4_Exe("최고 우선 순위");
		Runnable_4_Exe obj2 = new Runnable_4_Exe("보통통 우선 순위");
		Runnable_4_Exe obj3 = new Runnable_4_Exe("최저저저 우선 순위");
		
		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj2);
		Thread thread3 = new Thread(obj3);
		
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread3.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
