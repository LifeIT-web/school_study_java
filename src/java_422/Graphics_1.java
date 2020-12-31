package java_422;

import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_1 extends Frame{

	public Graphics_1(String title) {
		
		super(title);
		
		setSize(300, 250);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
//		g.drawLine(10, 10, 190, 190); //직선
//		g.drawRect(10, 30, 100, 100); //사각형
//		g.drawOval(50, 50, 100, 100); //원
//		g.drawArc(100, 100, 80, 80, 0, 180);// 원호
//								  // 0도 , 180도
		g.fillRect(10, 30, 100, 100); // 색칠
	
	}
	
	public static void main(String[] args) {
		new Graphics_1("Graphics_1");
	}
}
