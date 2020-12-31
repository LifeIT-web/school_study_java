package java_410;

public class String_5 {

	public static void main(String[] args) {
		
	
	String str = "나는 초보다! 자바 별거 아니네!";
	
	boolean flag = str.startsWith("나는초보다!"); // str이 나는 고수다! 라고 시작했냐? 
	System.out.println(flag);
	
	flag = str.startsWith("나는"); // str이 나는으로 시작했냐?
	System.out.println(flag);
	
	flag = str.endsWith("별거 아니네"); // str이 별거 아니네로 끝났냐?
	System.out.println(flag);
	
	flag = str.endsWith("별거 아니네!"); // str이 별거 아니네!로 끝났냐?
	System.out.println(flag);
	
	}
}
