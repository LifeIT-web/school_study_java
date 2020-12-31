package java_407;

class Runnable_5_Exe implements Runnable
{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("-");
		}
	}
	
}
class Runnable_5_Exe_5 implements Runnable
{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("+");
		}
	}
	
}





public class Runnable_5 {

	public static void main(String[] args) {
		
		Runnable_5_Exe obj1 = new Runnable_5_Exe();
		Runnable_5_Exe_5 obj2 = new Runnable_5_Exe_5();
		
		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj2);
		
		thread2.setPriority(10);
		
		System.out.println("Priority of th1(-) : " + thread1.getPriority());
		System.out.println("Priority of th2(+) : " + thread2.getPriority());
		
		thread1.start();
		thread2.start();
	}
}
