package java_416;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class ScrollPane_1 extends Frame{

	public ScrollPane_1(String title) {
		
		super(title);
		
		ScrollPane srp = new ScrollPane();
		
		srp.setSize(220, 200); // ScrollPane ũ��
		
		Panel p1 = new Panel();
		p1.setLayout(new BorderLayout());
		
		TextArea txt = new TextArea("�ι�° ���");
		txt.setBackground(new Color(167, 255, 255));
		txt.setForeground(new Color(167, 167, 255));
		
		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());
		
		TextArea txt2 = new TextArea("�ý�Ʈ�����");
		txt2.setBackground(new Color(202, 187, 78));
		txt2.setForeground(new Color(167, 167, 60));
		
				// ������Ʈ��
		p1.add("North", new Button("��ư"));
		p1.add("Center", txt);            // �������1
		p1.add("South", new Button("Ȯ��")); // 1. ������Ʈ�� ��ο� �ְ�

		p2.add("North", new Button("��ư"));
		p2.add("Center", new TextArea("����° ���")).setBackground(new Color(100, 100, 50));
									// �������2
		p2.add("South", new Button("Ȯ��"));
		
		
		srp.add(p1); // 2. �г��� ��ũ�����ο� �ְ�
//		srp.add(p2);// ��ũ�������� ������Ʈ �ϳ��ۿ� ������ ����.
					// �ߺ��� �������͸� ������.
		
		add("Center", srp); // 3. ��ũ�������� �����ӿ� ������.
		
		setSize(200, 200); //  ũ�Ⱑ ũ�� ��ũ�ѹٴ� �����(�� �ȿ� �ִ� ���� �������ϱ�) 
		// ������ ũ��
		setVisible(true);	// �� �ȿ� �ִ� ������Ʈ�� �Ⱥ��̸� ��ũ�ѹٰ� ����
		
	}
	
	public static void main(String[] args) {
		new ScrollPane_1("��ũ�� �����̶�~~~");
	}
	
}
