package java_410;

public class String_12 {

	public static void main(String[] args) {
		
		String str = "높이 나는 새가 멀리 본다. 일찍 일어나는 새가 모이를 줍는다.";//34
		
		System.out.println("검색할 문자열 \n" + str);
		System.out.println("indexOf(새) : " + str.indexOf("새")); 
		// 새라는 글자가 인덱스 몇번째에있는지 알려줌
		System.out.println("indexOf(새, 10) : " + str.indexOf("새" ,10));
		// 첫인덱스(첫자릿수) 10번 이후로 나오는 새는 몇번째에 있는지 알려줌
		System.out.println("lastIndexOf(새) : " + str.lastIndexOf("모"));
		// 뒷인덱스(끝자릿수)부터 나오는 새라는 글자가 몇번째에 있는지 
		System.out.println("lastIndexOf(새, 10) : " + str.lastIndexOf("새", 10));
		// 10을 기준으로 그 밑에있는 "새"의 인덱스가 몇번째 있는지							//시작위치
		// 결과값이 없으면 -1이 나옴
	}
}
