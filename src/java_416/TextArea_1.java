package java_416;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextArea_1 extends Frame{
	
	public TextArea_1(String title) {

		super(title);
		
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea("간단한 메모를 입력"); // 사이즈 설정안하면 전체 폭을 잡는다.
		TextArea txt2 = new TextArea(10, 20); // 10행 20열의 20글자를 담을 수 있다.
		TextArea txt3 = new TextArea("문자열,문자열,,," , 5, 30); // 5행 30열의 글자를 담을수 있다.
		
		add(txt1);
		add(txt2);
		add(txt3);
		
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextArea_1("TextArea Test!!!!!!!");
	}

}
