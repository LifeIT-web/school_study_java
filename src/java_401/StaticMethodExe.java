package java_401;

class StaticMethod
{
	static int kor; // 국어점수
	static int eng; // 영어점수
	static int math; // 수학점수
	
	// static으로 선언된건 반드시 static 맴버끼리만 같이 쓸수 있다.
	// static으로 선언된건 이미 만들어져 있기때문에 참조할 수 있다.
	// ex) Math.random()
	
	static double average()
	{
		int total = kor + eng + math;
		return (total / 3.0);
	}

}


public class StaticMethodExe {

	public static void main(String[] args) {
		
		StaticMethod ssm = new StaticMethod();
		
		ssm.kor = 70;
		StaticMethod.eng = 65;
		StaticMethod.math = 90;
		
		System.out.println(" 평균11 : " + ssm.average());
		System.out.println(" 평균22 : " + StaticMethod.average());
	}
	
}
