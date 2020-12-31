public class Arithmetic_10 
{
	public static void main(String[] args) 
	{

		boolean a,b, c, d, e, f;

		a = (3>10) & (10>3);
		b = (3>10) && (10>3);

		c = (10>3) | (3>10);
		d = (10>3) || (3>10);
		
		e = !b && !c;
		f = !d || !a;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
	}
}
