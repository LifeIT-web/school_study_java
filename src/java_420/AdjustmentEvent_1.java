package java_420;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AdjustmentEvent_1 extends Frame implements AdjustmentListener{

	Scrollbar r, g, b;
	Panel panel;
	
	public AdjustmentEvent_1(String title) {
		super(title);
		
		r = new Scrollbar(Scrollbar.HORIZONTAL, 202, 20, 0, 275);
											//	 R, 크기, 초기값, 끝값
		g = new Scrollbar(Scrollbar.HORIZONTAL, 187, 20, 0, 275);
		b = new Scrollbar(Scrollbar.HORIZONTAL, 78, 20, 0, 275);
		
		// 노랭이부터 시작함.
		
//		r.addAdjustmentListener(new Handler());
//		g.addAdjustmentListener(new Handler());
//		b.addAdjustmentListener(new Handler());
		
		r.addAdjustmentListener(this);
		g.addAdjustmentListener(this);
		b.addAdjustmentListener(this);
		
		
		
		panel = new Panel();
		
		panel.add(r);
		panel.add(g);
		panel.add(b);
		
		add("Center", panel);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AdjustmentEvent_1("어드져스트먼트 이벤트 테스트!");
	}
	
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		int red, green, blue;
		
		red = r.getValue();
			 // 스크롤바에 있는 값을 가져온 것
		green = g.getValue();
		blue = b.getValue();
		
		System.out.println("red : " + red + ", green : " + green + ", blue : " + blue);
		panel.setBackground(new Color(red, green, blue));
	}
	
//	class Handler implements AdjustmentListener {
//
//		@Override
//		public void adjustmentValueChanged(AdjustmentEvent e) {
//			int red, green, blue;
//			
//			red = r.getValue();
//				 // 스크롤바에 있는 값을 가져온 것
//			green = g.getValue();
//			blue = b.getValue();
//			
//			System.out.println("red : " + red + ", green : " + green + ", blue : " + blue);
//			panel.setBackground(new Color(red, green, blue));
//		}
//
//	}
}
