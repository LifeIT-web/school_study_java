package java_417;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// cardLayout은 한 화면만 보여주기 때문에
// 이벤트를 이용해서 구별하기 쉽다.
public class CardLayout_2 extends Frame {
	
	Button first, prev, next, last;
	Panel buttons; // 버튼을 담는 패널이다.
	Panel slide; // 슬라이드를 담는 패널
	Panel card1, card2, card3, card4, card5; // slide에 포함될 Panel
	
	CardLayout card;
	
	public CardLayout_2(String title) {

		super(title);
		
		slide = new Panel();
		card = new CardLayout();
		
		slide.setLayout(card);
		
		// Button 을 담을 Panel
		
		buttons = new Panel();
		buttons.setLayout(new FlowLayout());
		
		first = new Button("<<");
		prev = new Button("<");
		next = new Button(">");
		last = new Button(">>");
		
		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);
		
		
		first.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//CardLayout 의 첫번째 slide(Panel) 이 보이도록 한다.
				card.first(slide);
			}
		}); // 익명 클래스 : 실행만하고 끝내겠다.
		
		prev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				card.previous(slide); //이전
			}
		});
		
		next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				card.next(slide); //다음
			}
		});

		last.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				card.last(slide); //마지막 slide(Panel)이 보이도록 함
			}
		});
		
		card1 = new Panel();
		card1.setBackground(new Color(202, 187, 78));
		card1.add(new Label("첫번째 페이지"));

		card2 = new Panel();
		card2.setBackground(new Color(167, 167, 255));
		card2.add(new Label("두두번째 페이지"));
		
		card3 = new Panel();
		card3.setBackground(new Color(167, 255, 255));
		card3.add(new Label("세세세번째 페이지"));
		
		card4 = new Panel();
		card4.setBackground(new Color(253, 75, 121));
		card4.add(new Label("네네네네번째 페이지"));

		card5 = new Panel();
		card5.setBackground(new Color(123, 75, 12));
		card5.add(new Label("다다다섯섯번째 페이지"));
		
		slide.add(card1, "1");
			//slide(Panel)에 card1(Panel)을 "1" 이란 이름으로 추가
		slide.add(card2, "2");
		slide.add(card3, "3");
		slide.add(card4, "4");
		slide.add(card5, "5");
		
		add("South", buttons);
		add("Center", slide);
		
		setSize(300, 300);
		setLocation(300, 300);
		setVisible(true);
		
		card.show(slide, "3"); // 처음에 보여주는 화면이 세번째 슬라이드가 나타남.
		
	}
	
	public static void main(String[] args) {
		new CardLayout_2("카드 레이아아아아아아아웃");
	}

}
