package java_416;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

//���� ���̾ƿ�

public class Panel_3 extends Frame {
	
	Panel n, w, e, c, s;
	
	public Panel_3(String title) {
		super(title);
		
		n = new Panel();
		w = new Panel();
		e = new Panel();
		c = new Panel();
		s = new Panel();
		
		n.setBackground(new Color(167, 255, 255));
		w.setBackground(new Color(16, 255, 255));
		e.setBackground(new Color(167, 25, 255));
		c.setBackground(new Color(167, 255, 55));
		s.setBackground(new Color(17, 55, 255));
		
		n.add(new Button("�г� 1"));
		w.add(new Button("�г� 2"));
		e.add(new Button("�г� 3"));
		c.add(new Button("�г� 4"));
		s.add(new Button("�г� 5"));
		
		add("North", n);
		add("West", w);
		add("East", e);
		add("Center", c);
		add("South", s);
		
		setSize(500, 500);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		new Panel_3("�г��̶��~~~~");
	}

}
