package java_413;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class buttom_3_3 {

	public static void main(String[] args) {
		Label[] lbl = new Label[50];
		Button[] btn = new Button[50];
		
		Frame ff = new Frame("����ǥ���");
			
		ff.setLayout(new FlowLayout());
			
		for (int i = 0; i < 50; i++) {
			lbl[i] = new Label(i + "���̺�"); // ����� �迭 190~255.190~255.0~80
			btn[i] = new Button(i + "��ư"); // ������ �迭 190~255.0~80.0~80
				
			lbl[i].setBackground(new Color(((int)(Math.random()*(255-190+1)) + 190)
												,(((int)(Math.random()*(255-190+1)) + 190))
												,((int)(Math.random()*(80-0+1)))));
				
			btn[i].setBackground(new Color(((int)(Math.random()*(255-190+1)) + 190)
						,((int)(Math.random()*(80-0+1)))
						,((int)(Math.random()*(80-0+1)))));
				
			ff.add(lbl[i]);
			ff.add(btn[i]);
				
		}
			
		ff.setSize(500, 500);
		ff.setVisible(true);
	}
}
