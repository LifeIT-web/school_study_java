package java_424;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// awt �� Ȯ����

public class JButton_1 extends JPanel{

	public JButton_1() {
		
		setLayout(new GridLayout(1, 3, 5, 5));
							
		AbstractButton btn = new JButton("Ȯ��");
		
		add(btn);
		
		btn = new JButton("���");
		add(btn);

		btn = new JButton("�ǵ�����");
		add(btn);
		
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 300);
//		Dimension() Dimension Ŭ������ ���� ��ü�� �ִ�
//		������Ʈ�� ���� ���� �� ���� ���̸� ĸ��ȭ��
		
	}
	
	public static void main(String[] args) {
		
		JFrame jff = new JFrame("JButton test");
		
		JButton_1 panel = new JButton_1();
		
		jff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jff.getContentPane().add(panel, "Center");
		// JFrame �� JButton�� ����ϱ� ����
		// AWT �� Frame ���� getContentPane().add() ó�� �����.
		// ȭ�鿡 ������Ʈ�� �߰��� ��쿡 add() �޼ҵ带 �̿������� 
		// Swing ������ getContentPane().add()ó�� �����
		
		jff.setSize(panel.getPreferredSize());
		jff.setVisible(true);
	}
}
