package java_424;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabWindows extends JFrame implements ChangeListener{

	JTabbedPane pane;
	JLabel lbl_info;
	
	public TabWindows(String title) {
		super(title);
		JPanel one, two, three;
		pane = new JTabbedPane();
		lbl_info = new JLabel("         ");
		
		one = new JPanel();
		one.add(new JLabel("첫번쩨 탭임"));
		one.add(new JTextField("문자 입력"));
		one.setBackground(Color.red);
		pane.addTab("<html><font color = red>one</font></html>", one);

		two = new JPanel();
		two.add(new JTextArea("두번째 탭입"));
		one.setBackground(Color.cyan);
		pane.addTab("<html><font color = blue>two</font></html>", two);
		
		three = new JPanel();
		three.add(new JLabel("세번쩨 탭임"));
		three.setBackground(Color.blue);
		pane.addTab("<html><font color = yello>three</font></html>", three); //html 태그
		
		pane.setSelectedIndex(0);
		pane.addChangeListener(this);
		this.getContentPane().add("North", new JLabel("탭을 사용한 예제"));
		this.getContentPane().add("Center", pane);
		this.getContentPane().add("South", lbl_info);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TabWindows("탭 예제");
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {

		int Index = pane.getSelectedIndex();
		String msg = "<html><font size = 5 color = pink>" + pane.getTitleAt(Index);
		msg += " 탭이 선택 되었습니다" + "</font></html>";
		lbl_info.setText(msg);
		pane.setSelectedIndex(Index);
		
	}

	
}
