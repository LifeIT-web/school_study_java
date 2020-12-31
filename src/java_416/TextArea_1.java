package java_416;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextArea_1 extends Frame{
	
	public TextArea_1(String title) {

		super(title);
		
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea("������ �޸� �Է�"); // ������ �������ϸ� ��ü ���� ��´�.
		TextArea txt2 = new TextArea(10, 20); // 10�� 20���� 20���ڸ� ���� �� �ִ�.
		TextArea txt3 = new TextArea("���ڿ�,���ڿ�,,," , 5, 30); // 5�� 30���� ���ڸ� ������ �ִ�.
		
		add(txt1);
		add(txt2);
		add(txt3);
		
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextArea_1("TextArea Test!!!!!!!");
	}

}
