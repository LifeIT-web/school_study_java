package java_422;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEvent_1 extends Frame implements WindowListener{

	public WindowEvent_1(String title) {
		super(title);
		
		addWindowListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new WindowEvent_1("윈도우");
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println(" 윈도우 열기기기");
	}

	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println(" 윈도우 닫기");
		this.dispose(); // 프로그램 종료
	}

	@Override
	public void windowClosed(WindowEvent e) {

		System.out.println(" 윈도우 완전 닫기");
	}

	@Override
	public void windowIconified(WindowEvent e) {

		System.out.println(" 윈도우 아이콘화");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println(" 윈도우 아이콘화 해제");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("윈도우 활성화");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("윈도우 비활성화");
		
	}
	
}
