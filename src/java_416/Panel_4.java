package java_416;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Panel_4 extends Frame{

	CheckboxGroup cbg;
	
	public Panel_4(String str) {
		super(str);
		
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(4, 3)); // 격자로 줄수 있는 레이아웃
		
		p1.setBackground(new Color(255, 178, 65));
		p1.add(new Label(""));
		p1.add(new Checkbox("리눅스"));
	
		p1.add(new Label(""));
		p1.add(new Checkbox("윈도우 10"));
		
		p1.add(new Label(""));
		p1.add(new Checkbox("리눅스"));
		
		p1.add(new Label(""));
		p1.add(new Checkbox("윈도우 10"));
		
		Panel p2 = new Panel();
		
		p2.setBackground(new Color(167, 255, 255));
		p2.add(new Label("환경설정", Label.CENTER));
		p2.add(new Button("불러오기"));
		p2.add(new Button(" 저    장  "));
		p2.add(new Button("다른 이름으로 저장"));
		// FlowLayout으로 왼~오른 으로 출력
		
		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(4, 3)); // 격자로 줄수 있는 레이아웃
								// 4행, 3열
		p3.setBackground(new Color(167, 167, 255));
		
		cbg = new CheckboxGroup();
		
		p3.add(new Label(""));
		p3.add(new Checkbox("진달래", cbg, false));
		
		p3.add(new Label(""));
		p3.add(new Checkbox("개나리", cbg, false));
		
		p3.add(new Label(""));
		p3.add(new Checkbox("무궁화", cbg, true));
		
		p3.add(new Label(""));
		p3.add(new Checkbox("벚꽃", cbg, false));
		
		add("North", p1);
		add("Center", p2);
		add("South", p3);
		// 중간으로 설정
		// 안쓰면 왼쪽으로 붙음
		
		setSize(450, 300);
		setVisible(true);
		
		

		
	}
	
	public static void main(String[] args) {
		
		new Panel_4("패널 태스트!!!");
	}
}
