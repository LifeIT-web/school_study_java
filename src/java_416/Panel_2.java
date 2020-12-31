package java_416;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Panel_2 extends Frame{

	public Panel_2(String title) {

		super(title);
		
		Panel p1 = new Panel();
		
		p1.add(new Button("Panel 1 ���� ��ư"));
		p1.add(new Checkbox("������"));
		// �г��� �⺻ �ʱⰪ ���̾ƿ� FlowLayout
		
		Panel p2 = new Panel();
		
		p2.add(new Label("�󺧶�"));
		p2.add(new Button("Panel 2 ���� ��ư"));
		// �г��� �⺻ ���̾ƿ� FlowLayout
		// �г����� �г� ���� �� �ִ�.
		
		Panel p3 = new Panel();
		
		p3.add(new Label("��33"));
		p3.add(new Button("Panel 3 ���� ��ư"));
		
		add("North", p1);
		  // rule : ÷�� �빮�ڸ� �����
		add("Center", new Button("��ư")); // Center��ü�� ��ư�̴�.
		add("West", p3);
		add("South", p2);
		//�������� �⺻ ���̾ƿ�
		
		setSize(400, 400); // ��ü ������ 400�̴�.
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Panel_2("�г� �׽�Ʈ~~");
	}
}
