package java_424;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// awt 의 확장판

public class JButton_1 extends JPanel{

	public JButton_1() {
		
		setLayout(new GridLayout(1, 3, 5, 5));
							
		AbstractButton btn = new JButton("확인");
		
		add(btn);
		
		btn = new JButton("취소");
		add(btn);

		btn = new JButton("되돌리기");
		add(btn);
		
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 300);
//		Dimension() Dimension 클래스는 단일 객체에 있는
//		컴포넌트의 가로 길이 및 세로 길이를 캡슐화함
		
	}
	
	public static void main(String[] args) {
		
		JFrame jff = new JFrame("JButton test");
		
		JButton_1 panel = new JButton_1();
		
		jff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jff.getContentPane().add(panel, "Center");
		// JFrame 에 JButton을 등록하기 위해
		// AWT 의 Frame 에서 getContentPane().add() 처럼 사용함.
		// 화면에 컴포넌트를 추가할 경우에 add() 메소드를 이용하지만 
		// Swing 에서는 getContentPane().add()처럼 사용함
		
		jff.setSize(panel.getPreferredSize());
		jff.setVisible(true);
	}
}
