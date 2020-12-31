package java_417;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayout_1 extends Frame{
	
	Button[] btn = new Button[6];
	
	public GridLayout_1(String str) {
		super(str);
		setLayout(new GridLayout(4, 3));
							// 3행 , 2열
		
		for (int i = 0; i < btn.length-1; i++) {
			btn[i] = new Button(i + " button");
			add(btn[i]);
		}
		
		setSize(300, 300);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new GridLayout_1("그리드 레이아우우웃");
	}

}
