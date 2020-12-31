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
		info.setText("���콺 �巡��!!!!!");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		info.setText(" X = " + e.getX() + " XX = " +
						e.getXOnScreen() + ", Y = " + e.getY());
		// getX �� getY �� ������ �� ��ǥ
		// getXOnScreen ����� ��ũ�� ���� x��ǥ
		// getYOnScreen ����� ��ũ�� ���� y��ǥ 
		
	}

	
}
