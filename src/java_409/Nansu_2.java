package java_409;

import java.util.Random;

public class Nansu_2 {

	public static void main(String[] args) {
		
		Random rnd = new Random(System.currentTimeMillis());
		// seed ���� ���� ���� ��� ������ ��������
		// ������ �߻��� �� �ִ�.
		// System.currentTimeMillis - >�ð��� ����
		// �̰� �Ⱦ��� �Ȱ��� ������ �߰��ȴ�.
		
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