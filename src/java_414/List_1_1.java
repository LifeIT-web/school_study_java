package java_414;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;

public class List_1_1 {

	public static void main(String[] args) {
		
			Frame ff = new Frame("List Test"); 
		
			ff.setLayout(new FlowLayout());
			
			List list = new List(4, true);
						//÷�� �����ִ� ���� // true ���� ���� ����  false ���� �Ѱ�.
			
			List list1 = new List(3, false);
						//÷�� �����ִ� ���� // true ���� ���� ����  false ���� �Ѱ�.
			
			Label lbl = new Label("List Test");
			Label lbl1 = new Label("���̶��");
			
			ff.add(lbl);
			
			list.add("386DX");
			list.add("486DX");
			list.add("486DX66");
			list.add("��Ƽ��4");
			list.add("������XP3");
			list.add("����ھ�");
			list.add("������");
			list.add("����");
			
			ff.add(list);

			ff.add(lbl1);
			
			list1.add("õ����");
			list1.add("����");
			list1.add("���϶�");
			list1.add("������");
			list1.add("��ǳ");
			list1.add("����ȭ");
			list1.add("����ȭ");
			list1.add("����");
			
			
			ff.add(list1);
			ff.setSize(300, 200);
			ff.setVisible(true);
	}
}