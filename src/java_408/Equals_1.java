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
		Seoul obj2 = new Seoul(100); // �ؽ��ڵ� ��
		Seoul obj3 = new Seoul(700);
		
		if (obj1.equals(obj2)) { //����� <���ڿ����Ҷ� ����>
			System.out.println("obj1 �� obj2�� ����.");
		}
		else
		{
			System.out.println("obj1�� obj2�� �ٴٸ���.");
		}
		
		System.out.println("obj1 : " + obj1.hashCode());
		System.out.println("obj2 : " + obj2.hashCode());
		System.out.println("obj3 : " + obj3.hashCode());
		
		if (obj1 == obj2) { // ���ں� <���ں��Ҷ� ����>
			System.out.println("obj1 �� obj2�� ����.");
		}
		else
		{
			System.out.println("obj1�� obj2�� �ٴٴٸ���.");
		}
		
		
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1 �� obj3�� ����.");
		}
		else
		{
			System.out.println("obj1�� obj3�� �ٴٸ���.");
		}
		
		if (obj1 == obj3) {
			System.out.println("obj1 �� obj3�� ����.");
		}
		else
		{
			System.out.println("obj1�� obj3�� �ٴٴٸ���.");
		}
		
	}
}
