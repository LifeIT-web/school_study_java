package java_422;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEvent_3 extends Frame{

	Frame[] win = new Frame[7];
	String[] str = {"빨강", "주황", "파랑", "노랑", "초록", "핑크", "검정"};
	Color[] color = {Color.red, Color.orange, Color.blue, Color.yellow, Color.green, Color.pink, Color.black};
	
	public WindowEvent_3(String title) {
		super(title);
		
		int i;
		
		for (i = 0; i < 7; i++) {
			win[i] = new Frame();
			win[i].setBackground(color[i]);
			win[i].setLocation(i * 80, i * 80);
			win[i].setSize(100, 100);
			win[i].addWindowListener(new WindowHandler());
			win[i].setVisible(true);;
		}
	}
	
	class WindowHandler extends WindowAdapter{
		
		@Override
		public void windowClosing(WindowEvent e) {
			String msg = "";
			Window obj = (Window) e.getSource();
			
			for (int i = 0; i < 7; i++) {
				if (obj == win[i]) {
					msg = str[i];
					win[i].dispose(); // 현재의 프레임만 종료
				}
			}
		System.out.println("닫힌 윈도우 색 : " + msg);
		}
		
		@Override
		public void windowIconified(WindowEvent e) { 
			System.out.println(" 윈도우 닫기 닫기");
			System.exit(0); // 어플리케이션 자체를 종료
			// 메소드 이름이 틀려도 에러안나옴 다만 오버라이딩 한게 아니라 새로운 메소드를 생성한것
		}
	}
	
	public static void main(String[] args) {
		new WindowEvent_3("윈도우 이벤트");
	}
}
