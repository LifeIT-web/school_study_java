package java_422;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEvent_2 extends Frame{

	public WindowEvent_2(String title) {
		super(title);
		
		addWindowListener(new Handler());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowEvent_2("윈도우 이벤트 테스트");
	}
	
	class Handler extends WindowAdapter{ 
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("윈도우 닫기");
			System.exit(0); // 프로그램 종료
		}
		//  아답터 클래스 용도는  이벤트안에 있는 필요한 메소드 하나나 두개 세개 등등 가지고 와서 쓸수 있음
		//  원래는 인터페이스 구현화 해서 모든 메소드를 오버라이딩 했다면
		//  이것은 아답터 클래스를 이용하여 필요한 메소드만 가지고 실행시킬 수 있음.		
	}
	
}
