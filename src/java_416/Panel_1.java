package java_416;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Panel_1{

	public static void main(String[] args) {
		
		Frame ff = new Frame("Panel Test ~~~~~");
		
		ff.setSize(300, 500);
		ff.setLayout(null);
		ff.setVisible(true);
		
		Panel p1 = new Panel();
		p1.setBackground(new Color(167, 255, 255)); // ù ���� �г�
		p1.setSize(150, 100); // ���� �г� ������
		p1.setLocation(50, 50); // ������ ȭ�� �̸� ���� �ִ� ���� �������� 50�� 50
		
		Panel p2 = new Panel();
		p2.setBackground(new Color(167, 167, 255));
		p2.setSize(150, 100);
		p2.setLocation(50, 170); // ������ ȭ�� �̸� ���� �ִ� ���� �������� 50�� 170
		
		Panel p3 = new Panel();
		p3.setBackground(new Color(202, 187, 78));
		p3.setSize(150, 100);
		p3.setLocation(50, 300); // ������ ȭ�� �̸� ���� �ִ� ���� �������� 50�� 300
		
		Button ok = new Button("OK");
		Label cancel = new Label("CANCEL", Label.CENTER);
		Button ok2 = new Button("oK");
		
		p1.add(ok);
		p2.add(cancel);
		p3.add(ok2);
		
		ff.add(p1);
		ff.add(p2);
		ff.add(p3);
		
	}
}