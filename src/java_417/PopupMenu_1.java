package java_417;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopupMenu_1 extends Frame implements MouseListener{

	PopupMenu popup;
	TextArea txt;
	
	public PopupMenu_1(String title) {
		super(title);
		
		popup = new PopupMenu("나의 팝업 메뉴");
		txt = new TextArea("이지윤~~~~~이지윤");
		
		MenuItem cut = new MenuItem("오려두기");
		MenuItem paste = new MenuItem("붙이기");
		MenuItem copy = new MenuItem("복사하기");
		
		popup.add(cut);
		popup.add(paste);
		popup.add(copy);
		
		txt.addMouseListener(this);
		txt.add(popup);
		
		add(txt);
		setSize(300, 300);
		setVisible(true);
		
	
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// 마우스 클릭
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스 누름
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 마우스 누르고 나올때
		popup.show(txt, e.getX(), e.getY());
		System.out.println("" + txt + " : " + e.getX() + "," + e.getY());
		// txt 보여주고 좌표값 보여줌
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스가 컴포넌트에 들어갔을때
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 컴포넌트에 나왔을때
	}
	

	public static void main(String[] args) {
		new PopupMenu_1("팝업 메뉴");
	}
}
