package java_422;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextEvent_1 extends Frame{

	TextField txt;
	Label lbl_info;
	
	public TextEvent_1(String title) {
		super(title);
		
		txt = new TextField("�ؽ�Ʈ �Է�...", 20);
//		txt.addTextListener(this);
		txt.addTextListener(new Handler());
		txt.selectAll();
		
		lbl_info = new Label("                   ");
		add("Center", lbl_info);
		add("South", txt);
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new TextEvent_1("�ý�Ʈ �̺�Ʈ �׽�Ʈ");
	}
	
	
//	@Override
//	public void textValueChanged(TextEvent e) {
//
//		lbl_info.setText(txt.getText()); // ���� �ִ� ���� �����ٰ� setText �� ���� ������
//	}

	class Handler implements TextListener
	{

	@Override
	public void textValueChanged(TextEvent e) {

		lbl_info.setText(txt.getText());
	}
		
	}
	
}
