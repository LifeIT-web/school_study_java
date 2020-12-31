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
		g.setFont(new Font("Serif", Font.PLAIN, 17)); //  글씨체
		g.drawString("Graphics를 이용해 그림을 그림", 10, 50); // 10에 50 위치
		
		g.drawOval(50, 100, 50, 50);
				// 위치	   /넓이
		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);
				// 위치	   /넓이
		g.setColor(Color.red);
		g.drawLine(100, 100, 150, 150);
				// 위치	   /넓이
		g.fillRoundRect(200, 100, 120, 80, 30, 30);
						// 위치	   /넓이       / 꼭지점 쪽의 그라운드형으로 만들겠다(숫자 높을수록 곡선, 낮을수록 뾰족)
		g.setColor(Color.orange);
		g.fillPolygon(new int[] {50 ,100, 150, 200, 150, 100 }, new int[] {250, 200, 200, 250, 300, 300}, 4);
								//50에 250꼭지점 100에 200 꼭지점 ... 모여서 꼭지점을 이으면됨
								// 꼭지점 갯수 ex) 지금 위에것 6이니까 그안의 범위의 각형은 다만들수 있음
		g.setColor(Color.cyan);
		g.fillArc(250, 200, 100, 100, 0, 120);
				//위치	  /넓이		/ 0도부터 120도를 돌려
		
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
