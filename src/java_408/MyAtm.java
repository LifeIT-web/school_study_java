package java_408;
// 중요한 코딩임. 공부*****
// 사용자, 돈, 계좌 (카드), atm 기기

class ATM
{
	private int total;
	
	public ATM(int total) {
		this.total = total;
	}
	
	 void deposit(int amount, String name) {
		total += amount;
		System.out.println(name + "님 입금 금액 : " + amount + "원");
	}
	
	 void withdraw(int amount, String name) { // 다른사람이 접근하는걸 막는다. synchronized
		
		if ((total - amount) > 0) {
			total -= amount;
			System.out.println(name + "님 출금 금액 : " + amount + "원");
		} else {
			System.out.println(name + "님 잔액이 부족해 출금할 수 없습니다.");
		}
	}
	public void getTotal()
	{
		System.out.println("\n 현재 계좌의 잔액 : " + total + "\n");
	}
}

class ATM_USER extends Thread // 각각 카드를 갖고있다.
{
	boolean flag = false; // 출금 / 입금  반복
	ATM obj; // ATM 기능을 볼수있는 맴버를 선언 / 객체가 ATM_USER로 들어옴.
	
	public ATM_USER(ATM obj, String name){
		super(name); // getName()
		this.obj = obj;
	}
	
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			
			try {
				sleep(1000); // Thread.sleep();이 기본이지만 이렇게도 쓸수잇다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
	synchronized (obj) 
			{
			if (flag) {
				obj.deposit((int)(Math.random()*10000), getName());
				obj.getTotal();
			} else {
				obj.withdraw((int)(Math.random()*10000), getName());
				obj.getTotal();
			}
			}
			flag = !flag;
		}
		
	}
}

public class MyAtm {
	
	public static void main(String[] args) {
		
		ATM atm = new ATM(10000); // 계좌에 10000원이 들어있으
		
		// ATM atm3 = atm; 36번~40번줄 의미가 저거여~
		
		ATM_USER user1 = new ATM_USER(atm, "이지윤"); // 즉 여기있는 user들은 다 객체를 공유하고 있다.
		ATM_USER user2 = new ATM_USER(atm, "홍길동");
		ATM_USER user3 = new ATM_USER(atm, "이새끼");
		
		user1.start();
		user2.start();
		user3.start();
		
	}
}
