package java_409;

public class Wrapper_2 {

	public static void main(String[] args) {
		
		Integer abc_1 = new Integer(789);
		Integer abc_2 = new Integer(456);
		
		int kbs_1 = (int)abc_1; // UnBoxing
		int kbs_2 = abc_2; 		// auto UnBoxing
		
		Integer cnn_1 = (Integer)378; // Boxing
		Integer cnn_2 = 573; // auto Boxing
		
		Integer king_1 = abc_1 + abc_2; // Wrapper 끼리 연산
		Integer king_2 = kbs_1 + kbs_2; // 기본형끼리 연산 후 wrapper클래스로 들어감 auto Boxing 
		
		int queen_1 = abc_1 + kbs_1; //기본형과  Wrapper 형 연산
		
		System.out.println("abc_1 : " + abc_1);
		System.out.println("abc_2 : " + abc_2);
		System.out.println("kbs_1 : " + kbs_1);
		System.out.println("kbs_2 : " + kbs_2);
		System.out.println("cnn_1 : " + cnn_1);
		System.out.println("cnn_2 : " + cnn_2);
		System.out.println("king_1 : " + king_1);
		System.out.println("king_2 : " + king_2);
		System.out.println("queen_1 : " + queen_1);
		
		/*
		 * 그렇다면 도대체 언제 오토박싱과 언박싱을 사용해야 할까요?
		 * 참조(객체) 타입과 기본 타입 사이의 "임피던스(옴 저항) 불일치(=불확실성의 원리)" 가 있는
		 * 경우에만 사용하세요(기본 타입을 쓸수 없는 경우에만 쓰세여)
		 * 예를 들어 Map이나 Set 같은 Java Collection 에는
		 * 기본 타입을 못 넣으니까
		 * 이런경우에는 참조(객체) 타입을 쓰면 됩니다.
		 * 하지만 과학 계산이나, 성능에 민감한 계산 코드에
		 * 오토박싱/ 언박싱을  사용하는 건 적절하지 않음
		 * Integer는 int를 완벽히 대체 할수 없음
		 * 오토박싱과 언박싱은 기본 타입과 참조 타입 사이의 구분을 흐릿하게 만들어주지만,
		 * 그 차이를 완벽히 없애는 건 아님
		 * */
	}
}
