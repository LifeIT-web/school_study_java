package java_416;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;

// ���� ���� �����ڸ� �ް� �Ǵ� Ŭ����
public class ScrollBar_1 extends Frame{

	public ScrollBar_1(String title) {
		
		super(title);
		
		Scrollbar srb1 = new Scrollbar(Scrollbar.VERTICAL, 10, 100, 0, 255);
												// ����          100�������� ��ũ�� �ٸ� 10��ġ���� �����ϴµ�
														// �ּҴ� 0 �ִ�� 255����
														// ������ �ִ�ũ��� ���� ũ�⸦ ����.
														// ������ �ּ�ũ��� ���� ũ�⸦ ���Ѱ�.
		
		Scrollbar srb2 = new Scrollbar(Scrollbar.HORIZONTAL, 100, 50, 0, 255);
												// ����
		add("West", srb1); // ����
		add("Center", new Label("��ũ�ѹ� �׽�Ʈ!!!!!")); // ��� 
		add("South", srb2);// �Ʒ���
		
		setSize(200, 200);
		setVisible(true);
	
	}
	
	
	public static void main(String[] args) {
		new ScrollBar_1("��ũ�ѹ�");
	}
}
// �⺻ ���̾ƿ��� �������� ����� ��ġ��.