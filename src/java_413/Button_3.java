package java_413;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_3 extends Frame{

	Label[] lbl = new Label[50];
	Button[] btn = new Button[50];
	
	public Button_3(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 50; i++) {
			lbl[i] = new Label(i + "레이블"); // 노란색 계열 190~255.190~255.0~80
			btn[i] = new Button(i + "버튼"); // 빨강색 계열 190~255.0~80.0~80
			
			lbl[i].setBackground(new Color(((int)(Math.random()*(255-190+1)) + 190)
											,(((int)(Math.random()*(255-190+1)) + 190))
											,((int)(Math.random()*(80-0+1)))));
			
			btn[i].setBackground(new Color(((int)(Math.random()*(255-190+1)) + 190)
					,((int)(Math.random()*(80-0+1)))
					,((int)(Math.random()*(80-0+1)))));
			
			add(lbl[i]);
			add(btn[i]);
			
		}
		
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Button_3("My Button Test~~~~~~~~"); // 프레임 상단 이름
	}
}
