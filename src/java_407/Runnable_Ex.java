package java_407;

class Runnable_Exa implements Runnable
{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + " �� ������!!~!!!");
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Runnable_Ex {

	public static void main(String[] args) {
		
		Runnable_Exa obj = new Runnable_Exa();
		
		Thread ttr = new Thread(obj);
		
		ttr.start();
		
		try {
			
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				System.out.println( i + " �� main() �޼ҵ�~~~~~~~~~@@@@@");
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}
}
