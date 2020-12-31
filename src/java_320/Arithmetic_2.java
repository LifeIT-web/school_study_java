public class Arithmetic_2 
{
	public static void main(String[] args) 
	{
		int a, b;

		a = 10;
		
		b = ++a; // a = a + 1

		System.out.println("++a : " + a + " b : " + b );

		
		b = a++; 

		System.out.println("a++ : " + a + " b : " + b );

		
		b = --a;  // a = a - 1

		System.out.println("--a : " + a + " b : " + b );

		b = a--;

		System.out.println("a-- : " + a + " b : " + b );

		System.out.println("Lee jiyoon");
	}
}
