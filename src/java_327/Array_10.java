public class Array_10 
{
	public static void main(String[] args) 
	{
		int[] number = {1, 2, 3, 4, 5};

		short[] newNumber = new short[10]; // int �迭�� 0 String �迭�� null�� �ڵ��ʱ�ȭ �ȴ�. float 0.0f double 0.0

		for (int i = 0; i < number.length ;i++ )
		{
			newNumber[i] = (short)number[i];
		}
		for (int i = 0; i < newNumber.length ; i++ )
		{
			System.out.print(newNumber[i]+ "\t");
		}

		System.out.println("Lee jiyoon");
	}
}