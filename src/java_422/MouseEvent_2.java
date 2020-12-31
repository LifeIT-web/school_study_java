package java_422;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseEvent_2 extends Frame implements MouseMotionListener{

	Label info;
	
	public MouseEvent_2(String title) {
		super(title);
		info = new Label();
		
		add("North", info);
		addMouseMotionListener(this);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEvent_2("mouse event");
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		info.setText("마우스 드래그!!!!!");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		info.setText(" X = " + e.getX() + " XX = " +
						e.getXOnScreen() + ", Y = " + e.getY());
		// getX 와 getY 는 프레임 상 좌표
		// getXOnScreen 모니터 스크린 상의 x좌표
		// getYOnScreen 모니터 스크린 상의 y좌표 
		
	}

	
}
