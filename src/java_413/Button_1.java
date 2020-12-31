package java_413;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
//Frame를 상속받고, 생성자를 생성해서 씀.
public class Button_1 extends Frame {

	Button btn1, btn2, btn3;
	
	public Button_1(String str) {
		super(str);
		setLayout(new FlowLayout()); //  왼쪽에서 오른쪽으로 출력하라는 버튼
		
		btn1 = new Button("가위");
		btn2 = new Button("바위");
		btn3 = new Button("보");
		
		add(btn1);
		add(btn2);
		add(btn3); //  프레임에 버튼 추가
		
		setSize(500, 500); // 프레임 사이즈
		setVisible(true);	//  보여달라.
	}
	
	public static void main(String[] args) {
		new Button_1("가위바위보");
	}
	
}
