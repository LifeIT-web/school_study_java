package java_413;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
//Frame�� ��ӹް�, �����ڸ� �����ؼ� ��.
public class Button_1 extends Frame {

	Button btn1, btn2, btn3;
	
	public Button_1(String str) {
		super(str);
		setLayout(new FlowLayout()); //  ���ʿ��� ���������� ����϶�� ��ư
		
		btn1 = new Button("����");
		btn2 = new Button("����");
		btn3 = new Button("��");
		
		add(btn1);
		add(btn2);
		add(btn3); //  �����ӿ� ��ư �߰�
		
		setSize(500, 500); // ������ ������
		setVisible(true);	//  �����޶�.
	}
	
	public static void main(String[] args) {
		new Button_1("����������");
	}
	
}
