package java_409;

public class Wrapper_9 {

	public static void main(String[] args) {
		
		short ss_data = 0;
		
		short max = Short.MAX_VALUE;
		short min = Short.MIN_VALUE;
		
		Short ss_1 = new Short("888"); //���ڸ� ���ڷ� �ٲٴ�  Short ������
		
		ss_data = ss_1.shortValue();
		
		System.out.println("ss_1 : " + ss_1);
		System.out.println("ss_data : " + ss_data);
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
//������ Math�� �ִ� random �޼ҵ带 ������ �ְ�, randomŬ������ ������ �ִ�.