package java_421;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarFrameTest {

	public static void main(String[] args) {

		MyFrame ff = new MyFrame("My Speed !");

		Graphics gg = ff.getGraphics();
		gg.setColor(Color.red);

		for (int i = 0; true; i += ff.speed) {

			try {
				Thread.sleep(100); // 0.1초 동안 진행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			gg.clearRect(0, 0, 350, 300); 
			// 옆으로 움직이면서 출력되는걸 이 메소드를 이용하면 350 300 사이즈 안에 출력되는 걸 지우겠다
			gg.drawString("이지윤", 180, i); 
							//  x축, y축
			i = (i < 300) ? i : 0; // i 가 350작으면 그 숫자만큼 출력하라 i보가 크면 0으로 초기화 해라
		}
	}
}

class MyFrame extends Frame {
	
	int speed = 1;
	
	Scrollbar sbb = new Scrollbar(Scrollbar.HORIZONTAL, 1, 15, 0, 95);

	Label lSpeed = new Label("Speed : ");

	public MyFrame(String title) {
		
		super(title);

		lSpeed.setBackground(Color.green);
		lSpeed.setSize(70, 20);
		lSpeed.setLocation(20, 40);

		sbb.setSize(300, 20);
		sbb.setLocation(20, 250);

		add(sbb);
		add(lSpeed);

		sbb.addAdjustmentListener(new MyHandler()); //Scrollbar 이벤트

		addWindowListener(new MyHandler()); //frame 이벤트

		setSize(350, 300);
		setLayout(null);
		setVisible(true);
		setResizable(false); // false : 크기 고정 마우스로 늘릴수 없다.
		
	}

	class MyHandler extends WindowAdapter implements AdjustmentListener {

		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			speed = sbb.getValue();
			lSpeed.setText("Speed : " + speed);

		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0); // 윈도우 아답터에 설정된 메소드
			//  프레임에 x표시 눌르면 나가게 해주는 메소드
		}

	}
}
