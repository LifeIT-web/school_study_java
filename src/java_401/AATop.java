package java_401;
//��ø Ŭ������ ��
class AA
{
	static class BB
	{
		static int bb = 25;
		
		static class CC
		{
			int cc = bb + 77;
		}
	}
}//����Ŭ���� => Ž���⿡ ���� Ŭ�����̸��� '$' �� ������ ����Ŭ����


public class AATop {

	public static void main(String[] args) {
		
		AA.BB.CC  obj1 = new AA.BB.CC();
		
		System.out.println("CC Ŭ���� ���� ���� : " + obj1.cc);
	}
}
