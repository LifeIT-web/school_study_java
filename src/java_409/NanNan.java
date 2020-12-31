package java_409;

import java.util.Random;

public class NanNan {

	public static void main(String[] args) {
		
		Random rnd1 = new Random(System.currentTimeMillis());
		
		int count1 = 0;
		
		for (int i = 0; i < 200; i++) {
			
			System.out.print((int)(rnd1.nextFloat()*(300 - (-250) + 1) + (-250)) + "\t");
			// Math.random()이 실수형이 이니까 똑같이 나오려면 저렇게 해야된다.
			// 그래서 random 클래스를 안쓰고 Math.random을 쓰는 이유이다.
			// rnd.nextInt()도 되긴해.
			
			count1++;
			
			if (count1 % 8 == 0) {
				System.out.println();
			}
		}
		
		
	}
}
