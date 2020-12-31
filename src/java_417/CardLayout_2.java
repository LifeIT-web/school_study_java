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

// cardLayout�� �� ȭ�鸸 �����ֱ� ������
// �̺�Ʈ�� �̿��ؼ� �����ϱ� ����.
public class CardLayout_2 extends Frame {
	
	Button first, prev, next, last;
	Panel buttons; // ��ư�� ��� �г��̴�.
	Panel slide; // �����̵带 ��� �г�
	Panel card1, card2, card3, card4, card5; // slide�� ���Ե� Panel
	
	CardLayout card;
	
	public CardLayout_2(String title) {

		super(title);
		
		slide = new Panel();
		card = new CardLayout();
		
		slide.setLayout(card);
		
		// Button �� ���� Panel
		
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
				//CardLayout �� ù��° slide(Panel) �� ���̵��� �Ѵ�.
				card.first(slide);
			}
		}); // �͸� Ŭ���� : ���ุ�ϰ� �����ڴ�.
		
		prev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				card.previous(slide); //����
			}
		});
		
		next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				card.next(slide); //����
			}
		});

		last.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				card.last(slide); //������ slide(Panel)�� ���̵��� ��
			}
		});
		
		card1 = new Panel();
		card1.setBackground(new Color(202, 187, 78));
		card1.add(new Label("ù��° ������"));

		card2 = new Panel();
		card2.setBackground(new Color(167, 167, 255));
		card2.add(new Label("�ει�° ������"));
		
		card3 = new Panel();
		card3.setBackground(new Color(167, 255, 255));
		card3.add(new Label("��������° ������"));
		
		card4 = new Panel();
		card4.setBackground(new Color(253, 75, 121));
		card4.add(new Label("�׳׳׳׹�° ������"));

		card5 = new Panel();
		card5.setBackground(new Color(123, 75, 12));
		card5.add(new Label("�ٴٴټ�����° ������"));
		
		slide.add(card1, "1");
			//slide(Panel)�� card1(Panel)�� "1" �̶� �̸����� �߰�
		slide.add(card2, "2");
		slide.add(card3, "3");
		slide.add(card4, "4");
		slide.add(card5, "5");
		
		add("South", buttons);
		add("Center", slide);
		
		setSize(300, 300);
		setLocation(300, 300);
		setVisible(true);
		
		card.show(slide, "3"); // ó���� �����ִ� ȭ���� ����° �����̵尡 ��Ÿ��.
		
	}
	
	public static void main(String[] args) {
		new CardLayout_2("ī�� ���̾ƾƾƾƾƾƾƿ�");
	}

}
