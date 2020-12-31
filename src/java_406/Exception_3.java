package java_406;


public class Exception_3 {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("예외 발생 전 ********************");
			throw new NumberFormatException("숫자 데이터가 아닙니다.");
			
			//System.out.println("예외 발생 후 ********************"); -> 여기는 도달 하지 못한다. 그밑으론 출력 불가
		} catch (NumberFormatException e) { // Exception
			System.out.println("내가 만든 예외 : " + e);
			//e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
	}
}

// 예외를 강제적으로 만들수 있는게 throw
