package java_416;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Panel_4 extends Frame{

	CheckboxGroup cbg;
	
	public Panel_4(String str) {
		super(str);
		
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(4, 3)); // ���ڷ� �ټ� �ִ� ���̾ƿ�
		
		p1.setBackground(new Color(255, 178, 65));
		p1.add(new Label(""));
		p1.add(new Checkbox("������"));
	
		p1.add(new Label(""));
		p1.add(new Checkbox("������ 10"));
		
		p1.add(new Label(""));
		p1.add(new Checkbox("������"));
		
		p1.add(new Label(""));
		p1.add(new Checkbox("������ 10"));
		
		Panel p2 = new Panel();
		
		p2.setBackground(new Color(167, 255, 255));
		p2.add(new Label("ȯ�漳��", Label.CENTER));
		p2.add(new Button("�ҷ�����"));
		p2.add(new Button(" ��    ��  "));
		p2.add(new Button("�ٸ� �̸����� ����"));
		// FlowLayout���� ��~���� ���� ���
		
		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(4, 3)); // ���ڷ� �ټ� �ִ� ���̾ƿ�
								// 4��, 3��
		p3.setBackground(new Color(167, 167, 255));
		
		cbg = new CheckboxGroup();
		
		p3.add(new Label(""));
		p3.add(new Checkbox("���޷�", cbg, false));
		
		p3.add(new Label(""));
		p3.add(new Checkbox("������", cbg, false));
		
		p3.add(new Label(""));
		p3.add(new Checkbox("����ȭ", cbg, true));
		
		p3.add(new Label(""));
		p3.add(new Checkbox("����", cbg, false));
		
		add("North", p1);
		add("Center", p2);
		add("South", p3);
		// �߰����� ����
		// �Ⱦ��� �������� ����
		
		setSize(450, 300);
		setVisible(true);
		
		

		
	}
	
	public static void main(String[] args) {
		
		new Panel_4("�г� �½�Ʈ!!!");
	}
}
