package java_424;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Java2D_2 extends Frame{

	Rectangle2D.Double rect;
	Ellipse2D.Double circle;
	Line2D.Double line;
	
	float[] pattern = {30, 100, 10, 50, 200};
					//30�߰� 50���� 10�߰� 25���� 10�߰� 30���� ... �ݺ� ��, �������� ũ��ȿ����� ����
	public Java2D_2(String title) {
		super(title);
		
		rect = new Rectangle2D.Double(20, 50, 250, 200);
		circle = new Ellipse2D.Double(50, 50, 200, 200);
		line = new Line2D.Double(30.1, 51.3, 230.9, 289.1);
		
		setSize(350, 350);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setStroke(new BasicStroke(7)); // BasicStroke(7) : 7��ŭ�� �β�
		g2.setColor(Color.blue);
		g2.draw(rect);

		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.red);
		g2.draw(circle);
		
		g2.setStroke(new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, pattern, 0));
																						// �� float���� ����	
		g2.setColor(Color.black);
		g2.draw(line);
	}
	
	public static void main(String[] args) {
		new Java2D_2("2D  ");
	}
}
