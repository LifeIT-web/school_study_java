package java_420;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Window;

public class Window_1 extends Frame{
	
	Window[] win = new Window[40];
	Color[] color = {Color.red, Color.yellow, Color.green, Color.cyan, Color.blue};
	
	public Window_1(String title) {
		super(title);
		
		int x =0, y=0;
		
		for (int i = 0; i < 40; i++) {
			win[i] = new Window(this);
			win[i].setBackground(color[i % 5]);
			
			Label lbl = new Label(i + " 번 윈도우");

		
			if ((i/10) % 2 != 1) {
				x += 10;
				y += 10;
				win[i].setBounds(150 + (x), 150 + (y), 100, 100);

			}
			else
			{
				x -= 10;
				y += 10;
				win[i].setBounds(150 + (x), 150 + (y), 100, 100);
			}
			
			win[i].setVisible(true);

		}
		
//		for (int i = 0; i < win.length; i+=3) {
//			win[i].setVisible(false);
//		}
		
		setLocation(110, 160);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Window_1("윈도우 라네");
	}
	

}
