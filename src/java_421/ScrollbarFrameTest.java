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
				Thread.sleep(100); // 0.1�� ���� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			gg.clearRect(0, 0, 350, 300); 
			// ������ �����̸鼭 ��µǴ°� �� �޼ҵ带 �̿��ϸ� 350 300 ������ �ȿ� ��µǴ� �� ����ڴ�
			gg.drawString("������", 180, i); 
							//  x��, y��
			i = (i < 300) ? i : 0; // i �� 350������ �� ���ڸ�ŭ ����϶� i���� ũ�� 0���� �ʱ�ȭ �ض�
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

		sbb.addAdjustmentListener(new MyHandler()); //Scrollbar �̺�Ʈ

		addWindowListener(new MyHandler()); //frame �̺�Ʈ

		setSize(350, 300);
		setLayout(null);
		setVisible(true);
		setResizable(false); // false : ũ�� ���� ���콺�� �ø��� ����.
		
	}

	class MyHandler extends WindowAdapter implements AdjustmentListener {

		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			speed = sbb.getValue();
			lSpeed.setText("Speed : " + speed);

		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0); // ������ �ƴ��Ϳ� ������ �޼ҵ�
			//  �����ӿ� xǥ�� ������ ������ ���ִ� �޼ҵ�
		}

	}
}
