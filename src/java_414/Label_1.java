package java_414;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Label_1 {

	public static void main(String[] args) {
		
		Label label1, label2, label3, label4;
		
		Frame ff = new Frame("���� ���� ���̺� ~~~~~");
		
		ff.setLayout(new FlowLayout());
		
		label1 = new Label("��");
		label2 = new Label("����");
		label3 = new Label("����");
		label4 = new Label("�ܿ�");
		
		ff.setBackground(new Color(200, 181, 73)); // ������ ����� ����
		label1.setBackground(new Color(255, 167, 167)); // ���̺� ���� ����� ����
		label2.setBackground(new Color(175, 255, 255)); // ���̺� ���� ����� ����
		label3.setBackground(new Color(242 , 203, 97)); // ���̺� ���� ����� ����
		label4.setBackground(new Color(255, 255, 255)); // ���̺� ���� ����� ����
		label1.setForeground(new Color(0, 0, 0)); // ���� ���� (�����)
		label2.setForeground(new Color(0, 0, 0)); // ���� ���� (�����)
		label3.setForeground(new Color(0, 0, 0)); // ���� ���� (�����)
		label4.setForeground(new Color(0, 0, 0)); // ���� ���� (�����)
		
		ff.add(label1);
		ff.add(label2);
		ff.add(label3);
		ff.add(label4);
		
		ff.setSize(300, 200);
		ff.setVisible(true);
	}
}
