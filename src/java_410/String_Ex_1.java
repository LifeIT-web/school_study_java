package java_410;

public class String_Ex_1 {

public static void main(String[] args) {
		
		int[] str = {56, 33, 78, 89, 28};
		
		System.out.println("******** ���� �� ���� ���ڿ� **********");
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println("\n********* ���� ���� ���� ���ڿ� *********");
		
		for (int i = 0; i < str.length-1; i++) {
			for (int j = i+1; j < str.length; j++) {
				
				if (str[i] > str[j]) {  	//selection ���� �ӵ��������� ���� ����
					int temp = str[i];		// �������� �����ͺ��� ū�ͱ���(>)	  
					str[i] = str[j];		// �������� ū�ͺ��� �����ͱ���(<)
					str[j] = temp;			// 16�� ~ 26�ٱ��� �ϱ� ���	
				}							// �����϶�	
			}
			
		}
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
}
}