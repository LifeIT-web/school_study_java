package java_416;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;

// 가장 많은 생성자를 받게 되는 클래스
public class ScrollBar_1 extends Frame{

	public ScrollBar_1(String title) {
		
		super(title);
		
		Scrollbar srb1 = new Scrollbar(Scrollbar.VERTICAL, 10, 100, 0, 255);
												// 수직          100사이즈의 스크롤 바를 10센치부터 시작하는데
														// 최소는 0 최대는 255까지
														// 실질적 최대크기는 바의 크기를 뺀값.
														// 실질적 최소크기는 바의 크기를 더한값.
		
		Scrollbar srb2 = new Scrollbar(Scrollbar.HORIZONTAL, 100, 50, 0, 255);
												// 수평
		add("West", srb1); // 윗쪽
		add("Center", new Label("스크롤바 테스트!!!!!")); // 가운데 
		add("South", srb2);// 아랫쪽
		
		setSize(200, 200);
		setVisible(true);
	
	}
	
	
	public static void main(String[] args) {
		new ScrollBar_1("스크롤바");
	}
}
// 기본 레이아웃이 동서남북 가운데에 위치함.