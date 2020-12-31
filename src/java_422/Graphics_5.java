package java_422;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_5 extends Frame implements MouseMotionListener{

	
	int x = 0;
	int y = 0;
	
	public Graphics_5(String title) {
		super(title);
		addMouseMotionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//x를 누르면 닫겠다.
			}
		});
		
		setBounds(100, 100, 500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Graphics_5("그래픽");
	}
	
	@Override
	public void paint(Graphics g) {
		
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		
		
		g.drawString("마우스를 움직여", 20, 50);
		g.setColor(new Color(red, green, blue));
		g.drawString("|", x, y);
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}

	
}
