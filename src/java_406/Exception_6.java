package java_406;


class KimException extends Exception //  Exception 상속 받아서 나만의 예외처리 만들수 있음 단, super 호출 필수!
{										// 사용자 정의 Exception 클래스

	public KimException(String str) {
		super(str);
	}
}

public class Exception_6 {

	public static void main(String[] args) {
		
		try {
			int xy = (int)(Math.random()*(100-51+1))+51;
			
			if (xy % 5 != 0) {
				throw new KimException("5의 배수가 아닙니다."); // 자동 리소드 닫기  즉 강제적으로 예외 발생
			}else
				throw new KimException("5의 배수입니다.");
			
		} catch (KimException e) {
			System.out.println(e.getMessage());
		}
	}
}
