package java_410;

public class String_14 {

	public static void main(String[] args) {
		
		String[] str = {"사랑", "자바", "Love", "LOVE", "愛"};
		
		System.out.println("******** 정렬 전 수행 문자열 **********");
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println("\n********* 정렬 후후 수행 문자열 *********");
		
		for (int i = 0; i < str.length-1; i++) {
			for (int j = i+1; j < str.length; j++) {
				
				if (str[i].compareTo(str[j]) > 0) { // 문자일때 (Selection 정렬)
					String temp = str[i];			// 올림차순  >  
					str[i] = str[j];				// 내림차순 <
					str[j] = temp;					// 영어 대 > 영어 소 > 한자 > 한글(올림차순 기준)
				}									// 아스키코드 순 작은것부터 ~큰것까지
			}										// 16줄 ~ 26줄까지 암기 물어봄	
			
		}
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
	}
}
