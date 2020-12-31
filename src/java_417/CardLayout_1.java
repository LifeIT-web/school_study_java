package java_417;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Handler;

public class CardLayout_1 {
	
	public static void main(String[] args) {
		
		final Frame ff = new Frame("카드 레이아아아아아아아아웃");
		final CardLayout card = new CardLayout(10, 20);
		
		ff.setLayout(card);
		
		Panel card_1 = new Panel();
		card_1.setBackground(new Color(202, 187, 78));
		card_1.add(new Label("** Card_1 **"));

		Panel card_2 = new Panel();
		card_2.setBackground(new Color(167, 255, 255));
		card_2.add(new Label("** Card_2 !!"));
		
		Panel card_3 = new Panel();
		card_3.setBackground(new Color(167, 167, 255));
		card_3.add(new Label("!! Card_3 **"));

		Panel card_4 = new Panel();
		card_4.setBackground(new Color(167, 167, 167));
		card_4.add(new Label("!! Card_4 **"));
		
		ff.add(card_1, "1"); //Frame에 card_1을  "1"이라고 이름 붙이기
		ff.add(card_2, "2");
		ff.add(card_3, "3");
		ff.add(card_4, "4");
		
		class Handler extends MouseAdapter
		{
			public void mouseClicked(MouseEvent e)
			{
				//마우스 오른쪽 버튼이 눌렸을때
				if (e.getModifiers() == e.BUTTON3_MASK) {
					card.previous(ff); //CardLayout 의 이전 Panel를 보여줌
					System.out.println(e.getModifiers()); // 4가 나옴
				}
				else
				{
					card.next(ff);// CardLayout의 이후 Panel를 보여줌
					System.out.println(e.getSource()); // 여기 관련된 내용을 출력
					System.out.println(e.getModifiers()); // 16이 나옴
				}
			}
		}//class Handler
		
		card_1.addMouseListener(new Handler());
		card_2.addMouseListener(new Handler());
		card_3.addMouseListener(new Handler());
		card_4.addMouseListener(new Handler());
		
		ff.setSize(300, 300);
		ff.setLocation(300, 400);
		ff.setVisible(true);
	}
	
	
}
