package java_408;

class Seoul
{
	int number;
	
	
	public Seoul(int num) {
	
		number = num;
	}
}




public class Equals_1 {

	public static void main(String[] args) {
		
//		String obj1 = "korea seoul"; 
//		String obj2 = "korea seoul";
//		String obj3 = new String("korea seoul");
		
		Seoul obj1 = new Seoul(100);
		Seoul obj2 = new Seoul(100); // 해시코드 값
		Seoul obj3 = new Seoul(700);
		
		if (obj1.equals(obj2)) { //내용비교 <문자열비교할땐 쓰고>
			System.out.println("obj1 과 obj2는 같다.");
		}
		else
		{
			System.out.println("obj1과 obj2는 다다르다.");
		}
		
		System.out.println("obj1 : " + obj1.hashCode());
		System.out.println("obj2 : " + obj2.hashCode());
		System.out.println("obj3 : " + obj3.hashCode());
		
		if (obj1 == obj2) { // 숫자비교 <숫자비교할때 쓰고>
			System.out.println("obj1 과 obj2는 같다.");
		}
		else
		{
			System.out.println("obj1과 obj2는 다다다르다.");
		}
		
		
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1 과 obj3는 같다.");
		}
		else
		{
			System.out.println("obj1과 obj3는 다다르다.");
		}
		
		if (obj1 == obj3) {
			System.out.println("obj1 과 obj3는 같다.");
		}
		else
		{
			System.out.println("obj1과 obj3는 다다다르다.");
		}
		
	}
}
