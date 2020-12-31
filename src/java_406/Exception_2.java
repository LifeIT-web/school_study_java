package java_406;

public class Exception_2 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0 / 0); // 부정 , 불능(10 / 0) = > 에러가 발생하면 sysout(4), (4.5)는 실행 안되고 catch부분으로 가서 실행됨
			System.out.println(4);
			System.out.println(4.5);
			//오류가 없으면 catch부분은 넘겼다.
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(5);
			System.out.println(6);
		}
		finally {
			System.out.println(6.5);
		}

		System.out.println(7);
		System.out.println(8);
	}
}
// 실행할때마다 에러 메세지가 줄이 바뀌는 이유는 스레드가 돌고 있기 때문이다.