package java_409;

class Person
{
	long id;
	
	@Override // object �ȿ� �ִ� equals �� �������̵� ��.
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) { // ��ü�� �ִٸ�
			return id == ((Person)obj).id; // person���� ĳ���� �� obj�� ���� ����?
			//obj �� Object Ÿ���̹Ƿ� id ���� �����ϱ� ���ؼ���
			//Person Ÿ������ ����ȯ�� �ʿ��ϴ�.

		}else {
			return false; // Ÿ���� Person �� �ƴϸ� ���� ���� �ʿ䰡 ����.
		}
	}
	
	public Person(long id) {

		this.id = id;
	
	}
}




public class EqualsTest {

	public static void main(String[] args) {
		
		Person pp1 = new Person(202004090927L);
		Person pp2 = new Person(202004090927L);
		
		if (pp1 == pp2) { //�ּҰ��� ����
			System.out.println("pp1�� pp2�� ���� ����Դϴ�.");
		}
		else 
		{
			System.out.println("pp1�� pp2�� �ٸ� ����Դϴ�.");
		}
		if(pp1.equals(pp2)) // ���� ��ü �ȿ� �ִ� ���� ����
		{
			System.out.println("pp1�� pp2�� ���� ����Դϴٴٴٴٴٴٴ�.");
		}
		else
		{	
			System.out.println("pp1�� pp2�� �ٸ� ����Դϴٴٴٴٴٴٴ�.");
		}
	}
}
