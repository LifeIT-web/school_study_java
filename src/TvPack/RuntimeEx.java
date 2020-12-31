package TvPack;

public class RuntimeEx {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.print(value1 + value2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� ������");
			System.out.println("���� ���");
			System.out.println("num1 num2");
			return;
		}catch (NumberFormatException e) {
			System.out.println("���� ��ȯ �Ұ�");
		}
		finally {
			System.out.println("�ٽ� �����Ͻÿ�");
		}
		
	}
}
