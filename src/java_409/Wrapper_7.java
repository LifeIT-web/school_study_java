package java_409;

public class Wrapper_7 {

	public static void main(String[] args) {
		
		char[] obj = new char[args[0].length()+2]; //�׷��� ���ؼ� ���̿� +2�� �߰� 2
		
		args[0].getChars(0, args[0].length(), obj, 2);
		// 0���� args[0]���̸�ŭ obj���ٰ� 2������ �Է� �ϸ� ������ 2�� �����Ǹ� ����Ʈ
		
		for (int i = 0; i < obj.length; i++) {
			
			System.out.println("\t �Էµ� ����[" + obj[i] + "]");
			
			if (Character.isDefined(obj[i])) {
				System.out.println("\t �����ڵ��Դϴ�.");
			}
			
			if (Character.isLetter(obj[i])) {
				System.out.println("\t �����Դϴ�.");
			}

			if (Character.isDigit(obj[i])) {
				System.out.println("\t �������Դϴ�.");
			}
			
			System.out.println();
			
		}
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i]);
		}
		System.out.println();
	}
}


// 0������ ���� 0������ ���µ� +2�ع����� ���� 2���� �þ�� ����Ʈ
// **9��  args[0].getChars(0(���°����), args[0].length()(�Է��Ϸ��� ũ��), obj(��𿡴ٰ�), 2(���°����)); 
// **7�� char[] obj = new char[args[0].length()+2];