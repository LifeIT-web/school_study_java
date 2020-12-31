package java_407;

class Runnable_Exa_1 implements Runnable
{
	String name = "";
	
	public Runnable_Exa_1(String str) {
		name = str;
	}
	
	@Override
	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println(i + " 번 " + name + " 쓰레드");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}


public class Runnable_Ex_1 {

	public static void main(String[] args) {
		Runnable_Exa_1 ran = new Runnable_Exa_1("첫번째");
		Runnable_Exa_1 ran2 = new Runnable_Exa_1("두두 번째");
		Runnable_Exa_1 ran3 = new Runnable_Exa_1("세세세 번째");
		
		Thread thread = new Thread(ran);
		Thread thread2 = new Thread(ran2);
		Thread thread3 = new Thread(ran3);
		
		thread.start();
		thread2.start();
		thread3.start();
		
	}
}
