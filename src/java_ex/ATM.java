package java_ex;

public class ATM {

	private int total;
	
	public ATM(int total)
	{
		this.total = total;
	}
	
	void deposit(int amount, String name) {
		total += amount;
		System.out.println(name + " �Ա� �ݾ� : " + amount);
	}
	
	void withdraw(int amount, String name) {
		if((total - amount)>0) {
			total -= amount;
			
			System.out.println(name + " ��� �ݾ� : " + amount);
		}
		else {
			System.out.println(name + "���� �ܾ��� �����մϴ�.");
		}
	}
	public void getTotal()
	{
		System.out.println("���� ���� �ܾ� : " + total);
	}	
}