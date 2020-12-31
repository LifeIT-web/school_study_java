package java_416;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class BorderLayout_2 extends Frame{
	
	public BorderLayout_2(String title) {

		super(title);
		
		Panel pp = new Panel();
		pp.setLayout(new GridLayout(4, 1));
		pp.setBackground(new Color(167, 255, 255));
		
		pp.add(new Button("  ��ư   1 "));
		pp.add(new Button("  ��ư   2 "));
		pp.add(new Button("  ��ư   3 "));
		
		add("North", new Label("���̾ƿ�"));
		add("Center", pp);
		add("South", new TextField("���̾ƿ� ������ ȥ��", 15));
		
		setSize(200, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayout_2("�������̾ƿ�");
	}

}
