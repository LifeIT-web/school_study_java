package java_409;

import java.util.Random;

public class NanNan {

	public static void main(String[] args) {
		
		Random rnd1 = new Random(System.currentTimeMillis());
		
		int count1 = 0;
		
		for (int i = 0; i < 200; i++) {
			
			System.out.print((int)(rnd1.nextFloat()*(300 - (-250) + 1) + (-250)) + "\t");
			// Math.random()�� �Ǽ����� �̴ϱ� �Ȱ��� �������� ������ �ؾߵȴ�.
			// �׷��� random Ŭ������ �Ⱦ��� Math.random�� ���� �����̴�.
			// rnd.nextInt()�� �Ǳ���.
			
			count1++;
			
			if (count1 % 8 == 0) {
				System.out.println();
			}
		}
		
		
	}
}
