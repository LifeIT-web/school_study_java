package java_ex;

public class Es {

	 //	static void divide(int x, int y) {
//		System.out.println(x / y);
//	}
//	
//	public static void main(String[] args) {
//		
//		divide(10, 20);
//	}
	
	public static void main(String[] args) {
		
		Es_1 e = new Es_1();
		Es_1 e2 = new Es_1();
		
		
//		e.i = 20;
//		e.j = 30;
		
		System.out.println(e == e2);
		System.out.println(e.j == e2.j);
		
		System.out.println(e2.i);
		System.out.println(e2.j);
		Es_1.divide(10, 20);
		e.run();
	}
}
