package java_424;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample extends JFrame{

	JTable table;
	String[] fieldname = {"<html><font color = cyan size = 5>학번</font></html>",
						  "<html><font color = #cccc66 size = 5>국어</font></html>",
						  "<html><font color = #45b744 size = 5>수학</font></html>",
						  "<html><font color = #12aa22 size = 5>영어</font></html>",
						  "<html><font color = #41dc41 size = 5>과학</font></html>"};
	
	String[][] data = {{"2001300912", "67", "90", "80", "45"},
						{"2001201232", "95", "80", "70", "10"},
						{"2001191138", "60", "95", "50", "5"},
						{"2001512011", "45", "30", "50", "4"},
						{"2003306132", "100", "100", "100", "0"},
						{"2002431612", "50", "90", "95", "45"}};
	
	public JTableExample(String title) {
		super(title);
		
		table = new JTable(data, fieldname);
		JScrollPane sp = new JScrollPane(table);
		
		getContentPane().add(sp, "Center");
							//("Center", sp)도 된다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(350, 150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JTableExample("테이블 예제");
	}
}
