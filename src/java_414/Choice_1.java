package java_414;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_1 extends Frame{

	public Choice_1(String str) {
		super(str);
		
		setLayout(new FlowLayout());
		
		Label lbl = new Label("������ �����Ͻÿ� ", Label.CENTER);
		lbl.setBackground(new Color(168, 255, 255));
		
		Choice choice = new Choice(); // ��ũ�� ������ �� �� ��
		choice.setBackground(new Color(242, 203, 97));
		
		choice.add("���ѹα�");
		choice.add("�߱�");
		choice.add("ĳ����"); 
		choice.add("���þ�");
		choice.add("�̱�");
		choice.add("������");
		choice.add("������");
		
		add(lbl);
		add(choice);
		
		Label lbl1 = new Label("������ �����Ͻÿ� ", Label.CENTER);
		lbl1.setBackground(new Color(255, 167, 167));
		
		Choice choice1 = new Choice(); // ��ũ�� ������ �� �� ��
		choice1.setBackground(new Color(178, 255, 255));
		
		choice1.add("����");
		choice1.add("����¡");
		choice1.add("��Ÿ��"); 
		choice1.add("��ũ��");
		choice1.add("������ DC");
		choice1.add("�ĸ�");
		choice1.add("���帮��");
		
		add(lbl1);
		add(choice1);
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Choice_1("choice Test!!!");
	}
}
