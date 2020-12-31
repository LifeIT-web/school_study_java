public class Array_3 
{
	public static void main(String[] args) 
	{
		int[] month = {31, 28, 31,30, 31,30,31,31,30,31,30,31};

 		/*
		for (int i = 0; i < month.length ; i++ )
		{
			System.out.println((i + 1) + "월 " + month[i] + "일 ");
		}
		*/
		for (int ss : month ) // 배열month의 모든 요소를 ss라 할때
		{									// month => 반복 대상
			System.out.println(ss);// ss가 의미하는 각각의 값을 출력
		} //향상된 for 문
		System.out.println("Lee jiyoon");
	}
}