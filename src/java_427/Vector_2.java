package java_427;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_2 {

	public static void main(String[] args) {
		
		int i;
		Date date = new Date();
		Vector vv = new Vector(3, 5);
		
		vv.add("Java");
		vv.add(new Double(56.7));
		vv.add(date);
		
		System.out.println("========= 3���� ��ü �߰� ============");
		
		System.out.println("size 11: " + vv.size() + ", capacity : " + vv.capacity());
		
		System.out.println("================================");
		
		for (int j = 0; j < 10; j++) {
			vv.add(new Integer(j+1)); // object �䱸�Ҷ� �̰ɷ� ��! Integer��üŸ������ ������
//			vv.add(j+1); // object x
		}
		
		vv.add("korea");
		
		System.out.println("========= 10���� ��ü �߰� ===========");
		System.out.println("size 22: " + vv.size() + ", capacity : " + vv.capacity());
		
		System.out.println("------------- Vector ���� ��� --------");
		
		Enumeration enu = vv.elements(); // ����Ÿ���� ����Ÿ���̴�.
		// ����Ÿ��
		
		while (enu.hasMoreElements()) {// ����Ÿ���� ���� �ִٸ�
			System.out.println(enu.nextElement() + " "); //  ���Ϳ� �ִ� ������ �ϳ��� ���
		}
		
		System.out.println("======��ü���� Ȯ�� ========");
		
		if (vv.contains("Javar")) { //  Javar��� ���ڰ� ���� �Ǿ� �ֳ�?
			System.out.println("Java ���ڿ� ���Ե�");
		}
		else
		{
			System.out.println("Java ���ڿ� ���� �ȾȾȵ�");
		}
		
		System.out.println("56.7 ��ü ��ġ : " + vv.indexOf(new Double(56.7)));
		System.out.println("\n �Է½ð� : " + vv.get(vv.indexOf(date)));
		
		// Vector�� capacity�� ������ ��� �ڵ�������
		// ������ ũ�⺸�� 2���� ũ��� ������
		// �׷��� v�� capacity�� 12����
		
		// date ��ü ����
		
		vv.removeElementAt(vv.lastIndexOf(date));
		
		for (int j = 0; j < vv.size(); j+=3) {
			vv.removeElementAt(j); // 3�� ���� �� �� ������
		}
		
		vv.setElementAt("seoul", 2);
				// 3��° ��ġ�� korea ���ڿ� �߰�
		
		enu = vv.elements();
		
		while (enu.hasMoreElements()) { 
			System.out.println(enu.nextElement() + " ");
		}
		
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
		vv.trimToSize(); // ��������
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
		vv.setSize(3); // ũ�⸦ 3���� ����
		
		enu = vv.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
		}
		
		vv.removeAllElements(); // ��� ��ü ����
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
		
	}
}


//  ���� : ������ ���ڿ��� ���� ���� �ִ�.( = �� �޾� �帱�� �ִ�.)

// �ٵ� ���ͺ��� ArrayList�� ���� ����.