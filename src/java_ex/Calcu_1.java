package java_ex;

public class Calcu_1 {
	
	private static Calcu_1 c = new Calcu_1();
	

	static Calcu_1 getInstance() {
		return c;
	}
	
	public static void main(String[] args) {
	
//		Calcu_1 cc = new Calcu_1();
		
		Calcu_1 c1 = Calcu_1.getInstance();
		Calcu_1 c2 = Calcu_1.getInstance();
		if (c2 == c1) {
			System.out.println("같다");
		}else
		{
			System.out.println("다르다");
		}
		
	}
}
