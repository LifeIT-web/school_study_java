package java_421;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Component_1 extends Frame implements ComponentListener, ActionListener{

	TextArea txt;
	Button btn;
	
	public Component_1(String title) {
		super(title);
		
		btn = new Button("화면에서 잠시 사라짐");
		btn.addActionListener(this);
		
		add("South", btn);
		
		txt = new TextArea();
		add("Center", txt);
		addComponentListener(this); //  프레임 자체에 이벤트를 달았다.
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Component_1("컴포넌트 라네!");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			// this.hide();
			this.setVisible(false); // 화면에서 사라짐
			
			Thread.sleep(3000); //  3초간
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		this.setVisible(true);// 화면에 다시 보임
	}

	@Override
	public void componentResized(ComponentEvent e) {
		txt.append("컴포넌트 크기 변경!!!!!!! \n");
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		txt.append("컴포넌트 이동동 !!$$$$$$$$$$$$$! \n");
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		txt.append("컴포넌트 화면에 나타남!@@@@@@@@@@\n");
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		txt.append("컴포넌트 숨겨짐짐짐~~~~~~~~~~ \n");
		
	}

	
}
