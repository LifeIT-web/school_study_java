package java_417;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class GridLayout_2 extends Frame{

	public GridLayout_2(String str) {
		super(str);
		setLayout(new GridLayout(4, 2));
		List l1 = new List(5, false);
		Choice cc = new Choice();
		Panel pp = new Panel();
		
		
		add(new Button("Button1"));
		
		l1.add("����ȭ"); //���̸� 5
		l1.add("����"); 
		l1.add("��������"); 
		l1.add("�˲�"); 
		l1.add("������"); 
		
		add(l1);
		
		cc.add("����"); //���̸� 5
		cc.add("�Ѱ�"); //���̸� 5
		cc.add("�ΰ�"); //���̸� 5
		cc.add("����"); //���̸� 5
		cc.add("�װ�"); //���̸� 5

		add(cc);
		
		add(new TextArea("�Ƹ��ٿ� ���", 5, 15));
		add(new TextField("TextField"));
		
		pp.add(new Button("����"));
		pp.add(new Button("����"));
		
		add(pp);
		
		setSize(300, 300);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new GridLayout_2("�׸��巹�̾ƾƾƾƿ�");
	}
	
}
