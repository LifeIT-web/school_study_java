package java_423;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Animation_1 extends Frame{

	Image[] img = new Image[8];
	int num = 0;
	int xsize = 0;
	int ysize = 0;
	boolean flag = false;
	
	public Animation_1(String title) {
		super(title);
		
		for (int i = 0; i < 8; i++) {
			img[i] = Toolkit.getDefaultToolkit().getImage("bttrfly" + (i + 1) + ".jpg");
		}
		
		addWindowListener(new WindowHandler());
		setSize(500, 500);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {

		
		if (num > 7) {
			num = 0;
		}
		
		if (!flag) {
			if (xsize > 500) {
				flag = !flag;
			}
			
			xsize += 10;
			g.drawImage(img[num++], xsize, 100, this);
		}
		
		else
		{
			if (xsize <= 0) {
				flag = !flag;
			}
			
			xsize -= 10;
			g.drawImage(img[num++], xsize, 100, this);
		}

		if (num > 7) {
			num = 0;
		}
		
		if (!flag) {
			if (ysize > 500) {
				flag = !flag;
			}
			
			ysize += 10;
			g.drawImage(img[num++], 200, ysize, this);
		}
		
		else
		{
			if (ysize <= 0) {
				flag = !flag;
			}
			ysize -= 10;
			g.drawImage(img[num++], 200, ysize, this);
		}

	}
	
	class WindowHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		Animation_1 ani = new Animation_1("fly ~~~");
		
		while (true) {
			try {
				Thread.sleep(200);
				ani.repaint();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}

}
