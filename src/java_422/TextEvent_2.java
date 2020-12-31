package java_422;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextEvent_2 extends Frame{

	TextField txt;
	TextArea txt_area;
	
	public TextEvent_2(String title) {
		super(title);
		
		txt_area = new TextArea();
		txt = new TextField("", 20);
		
		
		txt.addTextListener(new Handler());
		txt.addActionListener(new Handler());
		
		txt_area.setFocusable(false); // ��Ŀ�� ����
		
		txt_area.setEditable(false); //Ȱ��ȭ ����
		
		add("North", new Label(" ���ڸ� �Է��ϰ�  enter "));
		add("Center", txt_area);
		add("South", txt);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextEvent_2("�ý�Ʈ �̺�Ʈ �׽�Ʈ");
		
	}
	
	class Handler implements ActionListener, TextListener
	{

		@Override
		public void textValueChanged(TextEvent e) { // �Է�
			
			try {
				int i = txt.getText().length();
				if (i == 0) {
					return; 
				}
				txt_area.append(" " + txt.getText().charAt(i - 1));
			} catch (Exception e2) {

				System.out.println(e2.getMessage());
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) { // enter

			txt_area.setBackground(new Color((int)(Math.random()*256),
					(int)(Math.random()*256),
					(int)(Math.random()*256)));
			txt.setBackground(new Color((int)(Math.random()*256),
					(int)(Math.random()*256),
					(int)(Math.random()*256)));
			
			txt.setText(""); //  �����
			txt_area.append("\n"); // ����!
			
		}
		
	}
		
}
