package java_408;

class ATM_1
{
	private int total;
	
	public ATM_1(int total) {
		this.total = total;
	}
	
	synchronized void deposit(int amount, String name)
	{
		
		total += amount;
		System.out.println(name + "총계 : " + amount);
	}
	synchronized void withdraw(int amount, String name)
	{
		if ((total - amount) > 0) {
			total -= amount;
			System.out.println(name + "총계 : " + amount);
			
		} else {
			System.out.println(name + "이름입니다.");
		}
	}
	
	void getTotal() {
		System.out.println("\n 총 잔액 : " + total + "\n");
	}
}

class ATM_USER_1 extends Thread
{
	boolean flag = false;
	ATM_1 obj;
	
	public ATM_USER_1(ATM_1 obj ,String name) {
		super(name);
		this.obj = obj;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (flag) {
				obj.deposit((int)(Math.random()*10000), getName());
				obj.getTotal();
			}
			else {
				obj.withdraw((int)(Math.random()*10000), getName());
				obj.getTotal();
			}
			
			flag = !flag;
		}
	}
	
}

public class MyAtm_Syncronized_1 {

	public static void main(String[] args) {
		ATM_1 atm = new ATM_1(10000);
		
		ATM_USER_1 user1 = new ATM_USER_1(atm, "이");
		ATM_USER_1 user2 = new ATM_USER_1(atm, "지");
		ATM_USER_1 user3 = new ATM_USER_1(atm, "윤");
		
		user1.start();
		user2.start();
		user3.start();
		
	}
}
