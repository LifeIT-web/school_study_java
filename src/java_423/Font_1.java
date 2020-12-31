package java_423;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Font_1 extends WindowAdapter {

	public static void main(String[] args) {
		
		XCanvas canvas = new XCanvas();
		Frame f = new Frame("폰튼 에제");
		f.add(canvas);
		f.setSize(250, 250);
		f.setVisible(true);
		f.addWindowListener(new Font_1() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

class XCanvas extends Canvas{
	Font font = new Font("Timesroman", Font.ITALIC, 30);
	String str = "빨주노초파남보";
	Color[] color = {Color.red, Color.orange, Color.yellow, Color.green,
						Color.blue, Color.magenta, Color.cyan};
	
	@Override
	public void paint(Graphics g) {
		g.setFont(font);
		
		for (int i = 0; i < 7; i++) {
			g.setColor(Color.gray);
			g.drawString(str.charAt(i) + " ", (i * 30 + 5), 105);
			g.setColor(color[i]);
			g.drawString(str.charAt(i) + " ", (i * 30), 100);
		}
	}

}

