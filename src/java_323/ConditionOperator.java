public class ConditionOperator 
{
	public static void main(String[] args) 
	{
		int a = 14, b = 21, c = 17, d = 56;

		int min;
		int max;
		
		min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		min = (min < d) ? min : d;
	
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		max = (max > d) ? max : d;

		System.out.println("가장 작은 값 : "  + min);
		System.out.println("가장 큰 값 : "  + max);
		System.out.println("Lee jiyoon");
	}
}
