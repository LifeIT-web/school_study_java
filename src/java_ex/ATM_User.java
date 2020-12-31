package java_ex;

public class ATM_User extends Thread {

	boolean flag = false;
	ATM obj;
	
	public ATM_User(ATM obj, String name)
	{
		super(name);
		this.obj = obj;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				
			}
			synchronized (obj) {
				if(flag) {
					obj.deposit((int)(Math.random()*10000), getName());
					obj.getTotal();
				}
				else {
					obj.withdraw((int)(Math.random()*10000) , getName());
					obj.getTotal();
				}
			}
			flag = !flag;
		}
	}
}
