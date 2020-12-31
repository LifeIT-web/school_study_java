package java_416;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextField_2 extends Frame{
	
	public TextField_2(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea(10, 30); // 10�� 30���� �Է�ũ�⸦ ����.
		TextField txt2 = new TextField("�ȳ��Ͻÿ�", 20); 
									// �ȳ��Ͻÿ��� �ְ�, 20������ ���� �ְʹ�.
		
		txt1.setText("���ڿ� �Է� : ");
		txt1.setBackground(new Color(167, 255, 255));
		txt1.setFont(new Font("�ü�ü", Font.ITALIC|Font.BOLD, 17));
										// ���� | ���ϰ� , ��Ʈ ũ�� (��Ÿ���� �ȸ������� �ִ�.)
		txt1.setForeground(new Color(202, 181, 73));
		
		txt2.setEchoChar('%'); // "�ȳ��Ͻÿ�" �� "%%%%%" �� ǥ����.
		txt2.setForeground(new Color(167, 0, 255));
		
		add(txt1);
		add(txt2);
		
		setSize(300, 300);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new TextField_2("TextField Test!!!!!!!!!!!!!");
	}

}
