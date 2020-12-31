package java_409;

import java.util.Random;

public class Nansu_2 {

	public static void main(String[] args) {
		
		Random rnd = new Random(System.currentTimeMillis());
		// seed 값을 주지 않을 경우 일정한 패턴으로
		// 난수가 발생할 수 있다.
		// System.currentTimeMillis - >시간을 넣음
		// 이걸 안쓰면 똑같은 난수가 추가된다.
		
		int count = 0;
		
		for (int i = 0; i < 200; i++) {
			
			System.out.print(rnd.nextInt() + "\t");
			
			count++;
			
			if (count % 5 == 0) {
				System.out.println();
			}
		}
	}
}
