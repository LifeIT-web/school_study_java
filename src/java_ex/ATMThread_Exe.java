package java_ex;

public class ATMThread_Exe {
	
	public static void main(String[] args) {
		ATM obj = new ATM(1000);
		ATM_User user1 = new ATM_User(obj, "≤Û");
		ATM_User user2 = new ATM_User(obj, "¿’");
		ATM_User user3 = new ATM_User(obj, "±‘");
		
		user1.start();
		user2.start();
		user3.start();
	}
}
