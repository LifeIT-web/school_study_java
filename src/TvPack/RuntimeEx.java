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
			System.out.println("실행 매개값의 수가 부족함");
			System.out.println("실행 방법");
			System.out.println("num1 num2");
			return;
		}catch (NumberFormatException e) {
			System.out.println("숫자 변환 불가");
		}
		finally {
			System.out.println("다시 실행하시오");
		}
		
	}
}
