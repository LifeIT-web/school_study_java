package java_416;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Panel_2 extends Frame{

	public Panel_2(String title) {

		super(title);
		
		Panel p1 = new Panel();
		
		p1.add(new Button("Panel 1 위의 버튼"));
		p1.add(new Checkbox("이지윤"));
		// 패널의 기본 초기값 레이아웃 FlowLayout
		
		Panel p2 = new Panel();
		
		p2.add(new Label("라벨라벨"));
		p2.add(new Button("Panel 2 위의 버튼"));
		// 패널의 기본 레이아웃 FlowLayout
		// 패널위의 패널 넣을 수 있다.
		
		Panel p3 = new Panel();
		
		p3.add(new Label("라벨33"));
		p3.add(new Button("Panel 3 위의 버튼"));
		
		add("North", p1);
		  // rule : 첨에 대문자를 써야함
		add("Center", new Button("버튼")); // Center전체가 버튼이다.
		add("West", p3);
		add("South", p2);
		//프레임의 기본 레이아웃
		
		setSize(400, 400); // 전체 사이즈 400이다.
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Panel_2("패널 테스트~~");
	}
}
