package java_331;

class Grade {

	int kor = 60;
	int eng = 60;
	int math = 60;

}

public class Result_1 {
	
	public static void main(String[] args) {
		
	
		Grade grade_1 = new Grade();
		Grade grade_2 = grade_1;
		
		grade_1.kor = 78;
		grade_2.eng = 999;
		
		System.out.println(grade_1.kor);
		System.out.println(grade_1.eng);
		System.out.println(grade_1.math);
		System.out.println(grade_2.kor);
		System.out.println(grade_2.eng);
		System.out.println(grade_2.math);
		
	}
}






