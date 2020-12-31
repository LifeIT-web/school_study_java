package java_422;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_4 extends Frame{

	public Graphics_4(String title) {
		super(title);
		
		XCanvas_1 grr = new XCanvas_1();
		
		grr.setSize(500, 500);
		
		add("Center", grr);
		
		setSize(550, 550);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Graphics_4("그래픽 테스트");
	}
}


class XCanvas_1 extends Canvas{
	
	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < 300; i++) {
			
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			
			
			int x = (int)(Math.random() * 300);
			int y = (int)(Math.random() * 300);
		
			int x2 = (int)(Math.random() * 300);
			int y2 = (int)(Math.random() * 300);

			int x3 = (int)(Math.random() * 360);
			int y3 = (int)(Math.random() * 360);
			
			g.setColor(new Color(red, green, blue));
			
			g.fill3DRect(x, y, x2, y2, false);
		}
	
	}
	
	
}