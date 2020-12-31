package java_417;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_3 extends Frame implements ActionListener{

	Label lbl_info;
	
	Button[] btn = new Button[10];
	
	Color[] color = {Color.red, Color.orange, Color.yellow,
					Color.green, Color.magenta, Color.cyan, Color.gray
					, new Color(202, 187, 78), new Color(167, 255, 255)
					, new Color(167, 167, 255)};
	
	
	String[] string = {"Red", "Orange", "Yellow", "Green",
					"Magenta", "Cyan", "Gray", "�˻�", "���ϴ�", "��ο��ϴ�"};
	
	public ActionEvent_3(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this); // actionPerformed �޼ҵ�� ��.
//			btn[i].addActionListener(new Handler()); �ڵ鷯 ���
			add(btn[i]);
		}
		
		setSize(300, 300);
		setVisible(true);
		
	
	}
	
//  class Handler implements ActionListener
//	{
//	ActionEvent_3 ttt;
//	Handler(ActionEvent_3 aaa){
//		ttt = aaa;
//	}
	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		
		for (int i = 0; i < btn.length; i++) {
			if (obj == btn[i]) {
				
				this.setBackground(color[i]);
//				ttt.setBackground(color[i]);
				
				System.out.println(e.getActionCommand() + "���Ƚ��ϴ�.");
				
			}			
		}
		System.out.println();
	}
//  }
	public static void main(String[] args) {
		new ActionEvent_3("�׼� �̺�����������������");
	}
}
