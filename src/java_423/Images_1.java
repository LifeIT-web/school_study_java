package java_423;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Images_1 extends Applet{

	Image img;
	String imgs = "..\\src\\images\\sea.jpg"; // 상대경로
//	String imgs = "../src/images/sea.jpg"; - 같지만 리눅스에서 쓰는 개념
	
	@Override
	public void init() {
		img = getImage(getDocumentBase(), imgs);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
}
