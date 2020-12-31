package java_417;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_1 extends Frame{

	Label lbl_info;
	Button btn1, btn2, btn3;
	
	public ActionEvent_1(String title) {
		super(title);
		
		lbl_info = new Label("버튼을 눌러 주세요 !");
		btn1 = new Button("◀  버튼");
		btn2 = new Button("▶  버튼");
		btn3 = new Button("■ 버튼");
		
//		btn1.addActionListener(this); 
//		btn2.addActionListener(this); // implements ActionListener 이벤트 사용 방법 1
//		btn3.addActionListener(this);
		
		btn1.addActionListener(new Handler());
		btn2.addActionListener(new Handler());
		btn3.addActionListener(new Handler());
		
		Panel panel = new Panel();
		
		panel.add(btn1);
		panel.add(btn3);
		panel.add(btn2);
	
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class Handler implements ActionListener{
		
	// 이벤트 사용 방법 2 
	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		
		if ((Button)obj == btn1) {
			lbl_info.setText("왼쪽 버튼이 눌렸슴"); // 컴포넌트에서 보임
			System.out.println("왼쪽 버튼이 눌렸슴"); // 콘솔창에서 보임
		}
		else if((Button)obj == btn3)
		{
			lbl_info.setText("가운데 버튼이 눌렀슴");
			System.out.println("가운데 버튼이 눌렸슴");
		}
		else
		{
			lbl_info.setText("오른쪽 버튼이 눌렸슴");
			System.out.println("오른쪽 버튼이 눌렸슴");
		}
		
	}
	
 }
	public static void main(String[] args) {
		new ActionEvent_1("엑션이벤트");
	}

}
