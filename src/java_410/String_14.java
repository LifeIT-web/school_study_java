package java_410;

public class String_14 {

	public static void main(String[] args) {
		
		String[] str = {"���", "�ڹ�", "Love", "LOVE", "��"};
		
		System.out.println("******** ���� �� ���� ���ڿ� **********");
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println("\n********* ���� ���� ���� ���ڿ� *********");
		
		for (int i = 0; i < str.length-1; i++) {
			for (int j = i+1; j < str.length; j++) {
				
				if (str[i].compareTo(str[j]) > 0) { // �����϶� (Selection ����)
					String temp = str[i];			// �ø�����  >  
					str[i] = str[j];				// �������� <
					str[j] = temp;					// ���� �� > ���� �� > ���� > �ѱ�(�ø����� ����)
				}									// �ƽ�Ű�ڵ� �� �����ͺ��� ~ū�ͱ���
			}										// 16�� ~ 26�ٱ��� �ϱ� ���	
			
		}
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
	}
}
