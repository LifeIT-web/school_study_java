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
		one.add(new JLabel("ù���� ����"));
		one.add(new JTextField("���� �Է�"));
		one.setBackground(Color.red);
		pane.addTab("<html><font color = red>one</font></html>", one);

		two = new JPanel();
		two.add(new JTextArea("�ι�° ����"));
		one.setBackground(Color.cyan);
		pane.addTab("<html><font color = blue>two</font></html>", two);
		
		three = new JPanel();
		three.add(new JLabel("������ ����"));
		three.setBackground(Color.blue);
		pane.addTab("<html><font color = yello>three</font></html>", three); //html �±�
		
		pane.setSelectedIndex(0);
		pane.addChangeListener(this);
		this.getContentPane().add("North", new JLabel("���� ����� ����"));
		this.getContentPane().add("Center", pane);
		this.getContentPane().add("South", lbl_info);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TabWindows("�� ����");
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {

		int Index = pane.getSelectedIndex();
		String msg = "<html><font size = 5 color = pink>" + pane.getTitleAt(Index);
		msg += " ���� ���� �Ǿ����ϴ�" + "</font></html>";
		lbl_info.setText(msg);
		pane.setSelectedIndex(Index);
		
	}

	
}
