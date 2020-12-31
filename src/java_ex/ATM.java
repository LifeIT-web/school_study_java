package java_ex;

public class ATM {

	private int total;
	
	public ATM(int total)
	{
		this.total = total;
	}
	
	void deposit(int amount, String name) {
		total += amount;
		System.out.println(name + " 입금 금액 : " + amount);
	}
	
	void withdraw(int amount, String name) {
		if((total - amount)>0) {
			total -= amount;
			
			System.out.println(name + " 출금 금액 : " + amount);
		}
		else {
			System.out.println(name + "님의 잔액이 부족합니다.");
		}
	}
	public void getTotal()
	{
		System.out.println("현재 계좌 잔액 : " + total);
	}	
}