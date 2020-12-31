package java_413;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_2 extends Frame{

	Label lbl1, lbl2, lbl3;
	Button btn1, btn2, btn3;
	
	public Button_2(String str) {
		super(str);
		setLayout(new FlowLayout()); 
		// 크기 마우스로 조절 하게 되면 자동으로 위치이동하게 출력 해준다.
		
		lbl1 = new Label("가위"); // 글 출력
		lbl2 = new Label("바위");
		lbl3 = new Label("보");
	
		btn1 = new Button("가위"); // 버튼 출력
		btn2 = new Button("바위");
		btn3 = new Button("보");
		
		add(lbl1); add(btn1); //글 버튼 출력
		add(lbl2); add(btn2);
		add(lbl3); add(btn3);
		
		lbl1.setEnabled(false); // 활성화 -> 비활성화
		btn3.setEnabled(false); // 활성화 -> 비활성화(Gray 색)
	
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Button_2("버튼 2 테스트~~~~~~~");
	}
}
