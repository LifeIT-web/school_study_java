package java_416;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class ScrollPane_1 extends Frame{

	public ScrollPane_1(String title) {
		
		super(title);
		
		ScrollPane srp = new ScrollPane();
		
		srp.setSize(220, 200); // ScrollPane 크기
		
		Panel p1 = new Panel();
		p1.setLayout(new BorderLayout());
		
		TextArea txt = new TextArea("두번째 방법");
		txt.setBackground(new Color(167, 255, 255));
		txt.setForeground(new Color(167, 167, 255));
		
		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());
		
		TextArea txt2 = new TextArea("택스트에어리어");
		txt2.setBackground(new Color(202, 187, 78));
		txt2.setForeground(new Color(167, 167, 60));
		
				// 컴포넌트들
		p1.add("North", new Button("버튼"));
		p1.add("Center", txt);            // 생성방법1
		p1.add("South", new Button("확인")); // 1. 컴포넌트를 페널에 넣고

		p2.add("North", new Button("버튼"));
		p2.add("Center", new TextArea("세번째 방법")).setBackground(new Color(100, 100, 50));
									// 생성방법2
		p2.add("South", new Button("확인"));
		
		
		srp.add(p1); // 2. 패널을 스크롤페인에 넣고
//		srp.add(p2);// 스크롤페인은 컴포넌트 하나밖에 생성을 못함.
					// 중복은 마지막것만 실행함.
		
		add("Center", srp); // 3. 스크롤페인을 프레임에 넣은것.
		
		setSize(200, 200); //  크기가 크면 스크롤바는 사라짐(그 안에 있는 글이 보여지니까) 
		// 프레임 크기
		setVisible(true);	// 그 안에 있는 컴포넌트가 안보이면 스크롤바가 생성
		
	}
	
	public static void main(String[] args) {
		new ScrollPane_1("스크롤 페인이라내~~~");
	}
	
}
