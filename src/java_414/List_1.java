package java_414;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
// List�� �����غ���
public class List_1 extends Frame{
	
	public List_1(String str) {

		super(str);
		
		setLayout(new FlowLayout());
		
		List list = new List(4, true);
					//÷�� �����ִ� ���� // true ���� ���� ����  false ���� �Ѱ�.
		
		List list1 = new List(3, false);
					//÷�� �����ִ� ���� // true ���� ���� ����  false ���� �Ѱ�.
		
		Label lbl = new Label("List Test");
		Label lbl1 = new Label("���̶��");
		
		add(lbl);
		
		list.add("386DX");
		list.add("486DX");
		list.add("486DX");
		list.add("��Ƽ��4");
		list.add("������XP3");
		list.add("����ھ�");
		list.add("������");
		list.add("����");
		
		add(list);

		add(lbl1);
		
		list1.add("õ����");
		list1.add("����");
		list1.add("���϶�");
		list1.add("������");
		list1.add("��ǳ");
		list1.add("����ȭ");
		list1.add("����ȭ");
		list1.add("����");
		
		
		add(list1);
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new List_1("List Test");
		
	}

}
