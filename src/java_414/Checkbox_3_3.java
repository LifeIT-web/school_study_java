package java_414;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_3_3 {

	public static void main(String[] args) {
		
			Frame ff = new Frame("체크박스 놀이");
		
			Checkbox os1, os2, os3;
			Checkbox cpu1, cpu2, cpu3;
			CheckboxGroup cbg;
		
			ff.setLayout(new FlowLayout());
			ff.setBackground(new Color(155, 155, 15));
				
			Label lbl1 = new Label("설치되어 있는 OS 선택(복수가능)", Label.CENTER);
			ff.add(lbl1);
			lbl1.setBackground(new Color(167, 255, 255));
			lbl1.setForeground(new Color(125, 101, 78));
			
			os1 = new Checkbox("윈도우 98");
			
			os2 = new Checkbox("윈도우 XP");
			os2.setBackground(new Color(200, 181, 73));
			os2.setForeground(new Color(255, 255, 255));
			
			os3 = new Checkbox("윈도우 10");
			
			ff.add(os1); ff.add(os2); ff.add(os3); // 체크박스버튼
			
			Label lbl2 = new Label("컴퓨터 CPU 종류 선택 ", Label.CENTER);
			ff.add(lbl2);
			
			lbl2.setBackground(new Color(0, 150, 100));
			lbl2.setForeground(new Color(255, 167, 167));

			cbg = new CheckboxGroup();
			cpu1 = new Checkbox("펜티엄4", cbg, false);
			cpu1.setBackground(new Color(175, 255, 255));
			cpu1.setForeground(new Color(242, 203, 97));
			
			cpu2 = new Checkbox("셀러론", cbg, false);
			
			cpu3 = new Checkbox("듀얼코어", cbg, false);
			cpu3.setBackground(new Color(168, 184, 30));
			cpu3.setForeground(new Color(222, 222, 22));
			
			
			ff.add(cpu1); ff.add(cpu2); ff.add(cpu3); // 라디오 버튼
			
			ff.setSize(460, 150);
			ff.setVisible(true);
			
	}

}
	

