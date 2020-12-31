package java_416;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBar_2 extends Frame implements AdjustmentListener{

	Scrollbar red, green, blue;
	Panel panel1, panel2;
	
	public ScrollBar_2(String title) {

		super(title);
		setLayout(null); // 임의적 위치 선정
		red = new Scrollbar(Scrollbar.HORIZONTAL, 10, 20, 0, 275);
											//  10부터, 20까지 크기 즉(10~30의 스크롤바 크기)0~275
		green = new Scrollbar(Scrollbar.HORIZONTAL, 10, 20, 0, 275);
		blue = new Scrollbar(Scrollbar.HORIZONTAL, 10, 20, 0, 275);
		// 10 10 10 부터 시작함 근데 색깔이 안보이는 이유는 그것에 대한 이벤트 설정은 안해놨다.
		// 누르는 순간 이벤트가 발생하기 때문에 그 다음 부터 색깔이 변한다.
		
		red.addAdjustmentListener(this); // 이벤트 가지고 있는 클레스를 red에 달겠다.
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		
		panel1 = new Panel();
		panel2 = new Panel();
		panel2.setLayout(new FlowLayout()); // 스크롤 왼 ~ 오른 순서
		
		panel1.setLocation(10, 10);
		panel1.setSize(200, 200);// 색깔 보여주는 크기
		panel2.setLocation(10, 230);
		panel2.setSize(200, 300); // 스크롤를 포함한 패널 크기
		
		panel2.add(red);
		panel2.add(green);
		panel2.add(blue);		
		
		add(panel1);
		add(panel2);
		
//		add("Center", panel1);
//		add("South", panel2);
		
		setSize(300, 300);
		setVisible(true);
	}	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// 스크롤 바 이동했을때 이벤트를 생성하겟다.
		panel1.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
		
		System.out.println("빨 : " + red.getValue());
		System.out.println("초 : " + green.getValue());
		System.out.println("파 : " + blue.getValue());
		System.out.println();
	}
	
	public static void main(String[] args) {
		new ScrollBar_2("Scrollbar Test!!");
	}

	
	
}
