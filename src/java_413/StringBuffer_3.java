package java_413;

public class StringBuffer_3 {

	public static void main(String[] args) {
		
		long start, end;
		
		String str1 = new String("1~10000 의 합 1: ");
		StringBuffer str2 = new StringBuffer("1~10000 의 합 2: ");
		
		start = System.currentTimeMillis();
		
		for (int i = 0; i < 30000; i++) {
			str1 += i;
			str1 += "+"; //  String 계산방법
		}
		
		end = System.currentTimeMillis(); // 이 컴퓨터가 가지고 있는 시간.
		
		System.out.println("String : " +  (end-start)); // 출력 걸리는 시간
		
		start = System.currentTimeMillis();
		
		for (int i = 0; i < 30000; i++) {
			str2.append(i);
			str2.append("+"); // StringBuffer 계산방법
		}
		
		end = System.currentTimeMillis(); 
		
		System.out.println("StringBuffer : " + (end - start)); // 출력 걸리는 시간
	}
}
// String < StringBuffer 더 빠르다.
// 문자열 이동이 있다면 StringBuffer를 사용하는 게 효율적이다.