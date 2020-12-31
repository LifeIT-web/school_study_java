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
		
		TextArea txt1 = new TextArea(10, 30); // 10행 30열의 입력크기를 만듬.
		TextField txt2 = new TextField("안녕하시오", 20); 
									// 안녕하시오를 넣고, 20글자의 폭을 주것다.
		
		txt1.setText("문자열 입력 : ");
		txt1.setBackground(new Color(167, 255, 255));
		txt1.setFont(new Font("궁서체", Font.ITALIC|Font.BOLD, 17));
										// 기울기 | 진하게 , 폰트 크기 (스타일이 안먹을수도 있다.)
		txt1.setForeground(new Color(202, 181, 73));
		
		txt2.setEchoChar('%'); // "안녕하시오" 를 "%%%%%" 로 표현함.
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
