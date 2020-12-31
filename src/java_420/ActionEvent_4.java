package java_420;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_4 extends Frame implements ActionListener{

	TextField txt_1, txt_2, txt_3;
	
	public ActionEvent_4(String str) {
		super(str);
		txt_1 = new TextField("", 20);
		txt_2 = new TextField("", 20);
		txt_3 = new TextField("", 20);
		
		txt_1.addActionListener(this);
		txt_2.addActionListener(this);
		txt_3.addActionListener(this);
		
		add("North", txt_1);
		add("Center", txt_2);
		add("South", txt_3);
		
		setSize(200, 200);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TextField obj = (TextField) e.getSource();
		
//		= Object obj2 = e.getSource();
		
//		if((TextField)obj2 == txt_1)
		
		if (obj == txt_1) {
			txt_2.setText(txt_1.getText());
			txt_3.setText(txt_1.getText());
			
			txt_2.setFocusable(true);
			txt_1.setFocusable(false);
			txt_3.setFocusable(false);
			
		} else if (obj == txt_2) {
			
			txt_1.setText(txt_2.getText());
			txt_3.setText(txt_2.getText());
			
			txt_3.setFocusable(true);
			txt_1.setFocusable(false);
			txt_2.setFocusable(false);
			
		}
		else
		{
			
			txt_1.setText(txt_3.getText());
			txt_2.setText(txt_3.getText());
			
			txt_1.setFocusable(true);
			txt_2.setFocusable(false);
			txt_3.setFocusable(false);
		}
				
		
	}
	
	public static void main(String[] args) {
		new ActionEvent_4("���� �̺�Ʈ");
	}
}
