package java_420;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_6 extends Frame implements ActionListener{

	Label lid;
	Label lpwd;
	Label lnum;
	TextField tfId;
	TextField tfPwd;
	TextField tfNum;
	Button ok;
	
	public ActionEvent_6(String title) {
		super(title);
		
		lid = new Label("ID : " , Label.RIGHT);
		lpwd = new Label("PWD : " , Label.RIGHT);
		lnum = new Label("Number : " , Label.RIGHT);
		
		tfId = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');
		tfNum = new TextField(10);
		ok = new Button("OK");
		
		tfId.addActionListener(this);
		tfPwd.addActionListener(this);
		tfNum.addActionListener(this);
		ok.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(lid); add(tfId);
		add(lpwd); add(tfPwd);
		add(lnum); add(tfNum);
		add(ok);
		
		setSize(600, 80);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ActionEvent_6("Login Test");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String id = tfId.getText();
		String password = tfPwd.getText();
		String number = tfNum.getText();
		
		if (!id.equals("korea")) {
			System.out.println("입력하신 아이디가 존재하지 않아");
			tfId.requestFocus(); // 수정하라고 파란색 물결 쳐줌
			tfId.selectAll(); // Id로 커서 옮겨줌 
			
		}
		else if(!password.equals("seoul"))
		{
			System.out.println("입력하신 패스워드가 존재하지 않아");
			tfPwd.requestFocus();
			tfPwd.selectAll();
		}
		else if(!number.equals("010-2659-3247"))
		{
			System.out.println("전 번 틀 렸 거 나 '-'안 적었다");
			tfNum.requestFocus();
			tfNum.selectAll();
		}
		else
		{
			System.out.println("로그인 되었다.");
		}
	}
}
