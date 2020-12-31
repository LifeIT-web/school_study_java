package java_422;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_2 extends Frame{

	public static void main(String[] args) {
		new Graphics_2("fdsa");
	}
	
	@Override
	public void paint(Graphics g) {
		g.setFont(new Font("Serif", Font.PLAIN, 17)); //  �۾�ü
		g.drawString("Graphics�� �̿��� �׸��� �׸�", 10, 50); // 10�� 50 ��ġ
		
		g.drawOval(50, 100, 50, 50);
				// ��ġ	   /����
		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);
				// ��ġ	   /����
		g.setColor(Color.red);
		g.drawLine(100, 100, 150, 150);
				// ��ġ	   /����
		g.fillRoundRect(200, 100, 120, 80, 30, 30);
						// ��ġ	   /����       / ������ ���� �׶��������� ����ڴ�(���� �������� �, �������� ����)
		g.setColor(Color.orange);
		g.fillPolygon(new int[] {50 ,100, 150, 200, 150, 100 }, new int[] {250, 200, 200, 250, 300, 300}, 4);
								//50�� 250������ 100�� 200 ������ ... �𿩼� �������� �������
								// ������ ���� ex) ���� ������ 6�̴ϱ� �׾��� ������ ������ �ٸ���� ����
		g.setColor(Color.cyan);
		g.fillArc(250, 200, 100, 100, 0, 120);
				//��ġ	  /����		/ 0������ 120���� ����
		
		g.setColor(new Color(202, 187, 78));
		g.fillArc(300, 300, 100, 100, 45, 270);
		
	
		
	}
	
	public Graphics_2(String title) {
		super(title);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
	
	}
}
