package java_417;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_1 extends Frame{

	Label lbl_info;
	Button btn1, btn2, btn3;
	
	public ActionEvent_1(String title) {
		super(title);
		
		lbl_info = new Label("��ư�� ���� �ּ��� !");
		btn1 = new Button("��  ��ư");
		btn2 = new Button("��  ��ư");
		btn3 = new Button("�� ��ư");
		
//		btn1.addActionListener(this); 
//		btn2.addActionListener(this); // implements ActionListener �̺�Ʈ ��� ��� 1
//		btn3.addActionListener(this);
		
		btn1.addActionListener(new Handler());
		btn2.addActionListener(new Handler());
		btn3.addActionListener(new Handler());
		
		Panel panel = new Panel();
		
		panel.add(btn1);
		panel.add(btn3);
		panel.add(btn2);
	
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class Handler implements ActionListener{
		
	// �̺�Ʈ ��� ��� 2 
	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		
		if ((Button)obj == btn1) {
			lbl_info.setText("���� ��ư�� ���Ƚ�"); // ������Ʈ���� ����
			System.out.println("���� ��ư�� ���Ƚ�"); // �ܼ�â���� ����
		}
		else if((Button)obj == btn3)
		{
			lbl_info.setText("��� ��ư�� ������");
			System.out.println("��� ��ư�� ���Ƚ�");
		}
		else
		{
			lbl_info.setText("������ ��ư�� ���Ƚ�");
			System.out.println("������ ��ư�� ���Ƚ�");
		}
		
	}
	
 }
	public static void main(String[] args) {
		new ActionEvent_1("�����̺�Ʈ");
	}

}
