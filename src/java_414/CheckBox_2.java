package java_414;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CheckBox_2 extends Frame{
	
	Checkbox cbx1, cbx2, cbx3, cbx4, cbx5, cbx6, cbx7, cbx8;
	CheckboxGroup cbg; // 4개중 하나만 선택할 수 있게 도와주는 클래스 (라디오 버튼)
	CheckboxGroup cbg1;
	
	public CheckBox_2(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("좋아하는 계절은? ", Label.CENTER); //  레이블 공간 내의 센터
		
		lbl1.setBackground(new Color(255, 200, 80));
		add(lbl1);
		
		
		cbg = new CheckboxGroup();
		cbx1 = new Checkbox("봄" ,cbg, true);
		cbx2 = new Checkbox("여름" ,cbg, true);
							
		cbx3 = new Checkbox("가을" , cbg, true); //  true 여러개있으면 마지막께 체크
								// 중복선택 x
		cbx4 = new Checkbox("겨울" , cbg, false);
		
		add(cbx1); add(cbx2);
		add(cbx3); add(cbx4);
		
		Label lbl2 = new Label("좋아하는 산은? ", Label.CENTER); //  레이블 공간 내의 센터
		
		lbl2.setBackground(new Color(200, 200, 80));
		add(lbl2);
		
		cbg1 = new CheckboxGroup();
		cbx5 = new Checkbox("백두산" ,cbg1, true);
		cbx6 = new Checkbox("한라산" ,cbg1, true);
		
		cbx7 = new Checkbox("북한산" , cbg1, true); //  true 여러개있으면 마지막께 체크
		// 중복선택 x
		cbx8 = new Checkbox("태백산" , cbg1, false);
		

		add(cbx5); add(cbx6);
		add(cbx7); add(cbx8);
		
		setSize(240, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new CheckBox_2("체크박스 예제");
	}
}
