package java_416;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayout_1 extends Frame{
	
	// �⺻������ ������ �ִ� ���̾ƿ��� BorderLayout�̱⿡
	// ���� ������ �ʿ䰡 ����.
	
	BorderLayout bb1 = new BorderLayout();
	
	public BorderLayout_1(String str) {
		super(str);
		
//		setLayout(bb1);
		
		add("North", new Button("����")).setBackground(new Color(255, 255, 255));
		add("West", new Button("����")).setBackground(new Color(167, 167, 255));
		add("East", new Button("����")).setBackground(new Color(167, 255, 255));
		add("Center", new Button("�߾�")).setBackground(new Color(202, 187, 78));
		add("South", new Button("����")).setBackground(new Color(0, 0, 0));
		// �׳� add�� �ߴٸ� �⺻���� Center�̴�.
		
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new BorderLayout_1("�������̾ƿ�");
	}

}
