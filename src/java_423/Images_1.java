package java_423;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Images_1 extends Applet{

	Image img;
	String imgs = "..\\src\\images\\sea.jpg"; // �����
//	String imgs = "../src/images/sea.jpg"; - ������ ���������� ���� ����
	
	@Override
	public void init() {
		img = getImage(getDocumentBase(), imgs);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
}
