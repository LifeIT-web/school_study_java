package java_424;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JList_1 extends JPanel{

	String[] str = {"대한민국", "스위스", "이집트", "페루", "캐나다","이탈리아", "브라질"};
	
	JList list;
	
	Vector info_data; // Vector 보단 ArrayList를 많이 씀 (형태는 같다)
	
	public JList_1() {
		
		setLayout(new BorderLayout());
		
		list = new JList();
		
		info_data = new Vector();
		
		for (int i = 0; i < 7; i++) {
			info_data.addElement(str[i]);
		}
		
		list.setListData(info_data);
		
		add("Center", new JScrollPane(list));
		add("South", new JLabel("<html><font size = 5 color = green>" + "리스트 Test ~~</font></html>"));
		
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 200);
	}
	
	public static void main(String[] args) {
		
		JFrame jff = new JFrame("JList test");
		
		JList_1 panel = new JList_1();
		
		jff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jff.setForeground(Color.blue);
		jff.setBackground(Color.lightGray); // 색이 안나오는 이유는 덮혀(?)있어서?
		
		jff.getContentPane().add(panel, "Center");
		jff.setSize(panel.getPreferredSize());
		jff.setVisible(true);
	}
}
