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
//		g.drawLine(10, 10, 190, 190); //����
//		g.drawRect(10, 30, 100, 100); //�簢��
//		g.drawOval(50, 50, 100, 100); //��
//		g.drawArc(100, 100, 80, 80, 0, 180);// ��ȣ
//								  // 0�� , 180��
		g.fillRect(10, 30, 100, 100); // ��ĥ
	
	}
	
	public static void main(String[] args) {
		new Graphics_1("Graphics_1");
	}
}
