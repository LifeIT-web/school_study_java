package java_416;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayout_1 extends Frame{
	
	// 기본적으로 가지고 있는 레이아웃이 BorderLayout이기에
	// 굳이 생성할 필요가 없다.
	
	BorderLayout bb1 = new BorderLayout();
	
	public BorderLayout_1(String str) {
		super(str);
		
//		setLayout(bb1);
		
		add("North", new Button("북쪽")).setBackground(new Color(255, 255, 255));
		add("West", new Button("서쪽")).setBackground(new Color(167, 167, 255));
		add("East", new Button("동쪽")).setBackground(new Color(167, 255, 255));
		add("Center", new Button("중앙")).setBackground(new Color(202, 187, 78));
		add("South", new Button("남쪽")).setBackground(new Color(0, 0, 0));
		// 그냥 add만 했다면 기본값은 Center이다.
		
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new BorderLayout_1("볼더레이아웃");
	}

}
