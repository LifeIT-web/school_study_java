package java_408;
// �߿��� �ڵ���. ����*****
// �����, ��, ���� (ī��), atm ���

class ATM
{
	private int total;
	
	public ATM(int total) {
		this.total = total;
	}
	
	 void deposit(int amount, String name) {
		total += amount;
		System.out.println(name + "�� �Ա� �ݾ� : " + amount + "��");
	}
	
	 void withdraw(int amount, String name) { // �ٸ������ �����ϴ°� ���´�. synchronized
		
		if ((total - amount) > 0) {
			total -= amount;
			System.out.println(name + "�� ��� �ݾ� : " + amount + "��");
		} else {
			System.out.println(name + "�� �ܾ��� ������ ����� �� �����ϴ�.");
		}
	}
	public void getTotal()
	{
		System.out.println("\n ���� ������ �ܾ� : " + total + "\n");
	}
}

class ATM_USER extends Thread // ���� ī�带 �����ִ�.
{
	boolean flag = false; // ��� / �Ա�  �ݺ�
	ATM obj; // ATM ����� �����ִ� �ɹ��� ���� / ��ü�� ATM_USER�� ����.
	
	public ATM_USER(ATM obj, String name){
		super(name); // getName()
		this.obj = obj;
	}
	
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			
			try {
				sleep(1000); // Thread.sleep();�� �⺻������ �̷��Ե� �����մ�.
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
		
		ATM atm = new ATM(10000); // ���¿� 10000���� �������
		
		// ATM atm3 = atm; 36��~40���� �ǹ̰� ���ſ�~
		
		ATM_USER user1 = new ATM_USER(atm, "������"); // �� �����ִ� user���� �� ��ü�� �����ϰ� �ִ�.
		ATM_USER user2 = new ATM_USER(atm, "ȫ�浿");
		ATM_USER user3 = new ATM_USER(atm, "�̻���");
		
		user1.start();
		user2.start();
		user3.start();
		
	}
}
