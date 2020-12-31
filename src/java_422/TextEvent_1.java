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
		
		txt = new TextField("텍스트 입력...", 20);
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
		new TextEvent_1("택스트 이벤트 테스트");
	}
	
	
//	@Override
//	public void textValueChanged(TextEvent e) {
//
//		lbl_info.setText(txt.getText()); // 여기 있는 값을 가져다가 setText 에 집어 넣으셔
//	}

	class Handler implements TextListener
	{

	@Override
	public void textValueChanged(TextEvent e) {

		lbl_info.setText(txt.getText());
	}
		
	}
	
}
