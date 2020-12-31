package java_424;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButton_2 extends JPanel{

	public JButton_2() {

		ImageIcon b1 = new ImageIcon("b1.gif");
		ImageIcon b1d = new ImageIcon("b1d.gif");
		ImageIcon b1p = new ImageIcon("b1p.gif");

		ImageIcon b2 = new ImageIcon("b2.gif");
		ImageIcon b2d = new ImageIcon("b2d.gif");
		ImageIcon b2p = new ImageIcon("b2p.gif");
		
		setDoubleBuffered(true);
		setLayout(new GridLayout(1, 2, 5, 5));
		
		AbstractButton btn = new JButton();
		
		btn.setIcon(b1);
		
		btn.setPressedIcon(b1d); // ���콺 Ŭ��
		btn.setRolloverIcon(b1p); // ���콺 �÷�����
		add(btn);
		
		btn = new JButton();
		btn.setIcon(b2);
		btn.setPressedIcon(b2d);
		btn.setRolloverIcon(b2p);
		add(btn);
		
		
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 200);
	}
	
	public static void main(String[] args) {
		
		JFrame jff = new JFrame("JButton test");
		
		JButton_2 panel  = new JButton_2();
		
		jff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jff.setForeground(new Color(202, 187, 78));
		jff.setBackground(new Color(167, 255, 255));
		jff.getContentPane().add(panel, "Center");
		
		
		jff.setSize(panel.getPreferredSize());
		jff.setVisible(true);
	}
}
