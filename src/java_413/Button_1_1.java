package java_413;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

// 직접 프레임 객체를 만들어서 생성

public class Button_1_1 {

	public static void main(String[] args) {
		Button btn1, btn2, btn3;
		
		Frame ff = new Frame("가위바위보"); // 프레임 상단의 이름
			
		ff.setLayout(new FlowLayout()); //  왼쪽에서 오른쪽으로 출력하라는 버튼
			
		btn1 = new Button("가위");
		btn2 = new Button("바위");
		btn3 = new Button("보");
			
		ff.add(btn1);
		ff.add(btn2);
		ff.add(btn3); //  프레임에 버튼 추가
			
		ff.setSize(500, 500); // 프레임 사이즈
		ff.setVisible(true);	//  보여달라.
		
	}
}
