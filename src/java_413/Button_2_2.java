package java_413;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_2_2 {

	public static void main(String[] args) {
		Label lbl1, lbl2, lbl3;
		Button btn1, btn2, btn3;
		
		Frame ff = new Frame("����������"); // ������ ����� �̸�
		
			ff.setLayout(new FlowLayout()); 
			 
			// ũ�� ���콺�� ���� �ϰ� �Ǹ� �ڵ����� ��ġ�̵��ϰ� ��� ���ش�.
			
			lbl1 = new Label("����"); // �� ���
			lbl2 = new Label("����");
			lbl3 = new Label("��");
		
			btn1 = new Button("����"); // ��ư ���
			btn2 = new Button("����");
			btn3 = new Button("��");
			
			ff.add(lbl1); ff.add(btn1); //�� ��ư ���
			ff.add(lbl2); ff.add(btn2);
			ff.add(lbl3); ff.add(btn3);
			
			lbl1.setEnabled(false); // Ȱ��ȭ -> ��Ȱ��ȭ
			btn3.setEnabled(false); // Ȱ��ȭ -> ��Ȱ��ȭ(Gray ��)
		
			ff.setSize(300, 200);
			ff.setVisible(true);
		
	}
}
