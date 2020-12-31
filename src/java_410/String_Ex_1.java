package java_410;

public class String_Ex_1 {

public static void main(String[] args) {
		
		int[] str = {56, 33, 78, 89, 28};
		
		System.out.println("******** 정렬 전 수행 문자열 **********");
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println("\n********* 정렬 후후 수행 문자열 *********");
		
		for (int i = 0; i < str.length-1; i++) {
			for (int j = i+1; j < str.length; j++) {
				
				if (str[i] > str[j]) {  	//selection 정렬 속도느리지만 이해 쉬움
					int temp = str[i];		// 오른차순 작은것부터 큰것까지(>)	  
					str[i] = str[j];		// 내림차순 큰것부터 작은것까지(<)
					str[j] = temp;			// 16줄 ~ 26줄까지 암기 물어봄	
				}							// 정수일때	
			}
			
		}
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
}
}