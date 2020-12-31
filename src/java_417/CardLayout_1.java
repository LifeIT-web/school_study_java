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
		
		final Frame ff = new Frame("ī�� ���̾ƾƾƾƾƾƾƾƿ�");
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
		
		ff.add(card_1, "1"); //Frame�� card_1��  "1"�̶�� �̸� ���̱�
		ff.add(card_2, "2");
		ff.add(card_3, "3");
		ff.add(card_4, "4");
		
		class Handler extends MouseAdapter
		{
			public void mouseClicked(MouseEvent e)
			{
				//���콺 ������ ��ư�� ��������
				if (e.getModifiers() == e.BUTTON3_MASK) {
					card.previous(ff); //CardLayout �� ���� Panel�� ������
					System.out.println(e.getModifiers()); // 4�� ����
				}
				else
				{
					card.next(ff);// CardLayout�� ���� Panel�� ������
					System.out.println(e.getSource()); // ���� ���õ� ������ ���
					System.out.println(e.getModifiers()); // 16�� ����
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
