package java_414;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_1 extends Frame{

	public Choice_1(String str) {
		super(str);
		
		setLayout(new FlowLayout());
		
		Label lbl = new Label("국가를 선택하시오 ", Label.CENTER);
		lbl.setBackground(new Color(168, 255, 255));
		
		Choice choice = new Choice(); // 스크롤 내리게 아 걍 봐
		choice.setBackground(new Color(242, 203, 97));
		
		choice.add("대한민국");
		choice.add("중국");
		choice.add("캐나다"); 
		choice.add("러시아");
		choice.add("미국");
		choice.add("프랑스");
		choice.add("스페인");
		
		add(lbl);
		add(choice);
		
		Label lbl1 = new Label("수도를 선택하시오 ", Label.CENTER);
		lbl1.setBackground(new Color(255, 167, 167));
		
		Choice choice1 = new Choice(); // 스크롤 내리게 아 걍 봐
		choice1.setBackground(new Color(178, 255, 255));
		
		choice1.add("서울");
		choice1.add("베이징");
		choice1.add("오타와"); 
		choice1.add("모스크바");
		choice1.add("워싱턴 DC");
		choice1.add("파리");
		choice1.add("마드리드");
		
		add(lbl1);
		add(choice1);
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Choice_1("choice Test!!!");
	}
}
