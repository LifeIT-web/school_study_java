package java_414;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_2 extends Frame{

	String[] continent = {"아시아", "유럽", "아메리카", "아프리카", "오세아니아"};
	String[] country = {"한국", "프랑스", "캐나다", "모로코", "뉴질랜드"};
	String[] capital = {"서울", "파일", "오타와", "라바트", "웰링턴"};
	
	
	public Choice_2(String str) {
		super(str);
		
		setLayout(new FlowLayout());// 이걸 안쓰면 각각 좌표를 찍어줘야함 setBounds
		
		Label lbl1 = new Label("대륙을 선택하시오");
		Label lbl2 = new Label("나라을 선택하시오");
		Label lbl3 = new Label("수도을 선택하시오");
	
		Choice choice_1 = new Choice();
		Choice choice_2 = new Choice();
		Choice choice_3 = new Choice();
		
		for (int i = 0; i < continent.length; i++) {
			choice_1.add(continent[i]);
		}
		
		for (int i = 0; i < country.length; i++) {			
			choice_2.add(country[i]);
		}

		for (int i = 0; i < country.length; i++) {			
			choice_3.add(capital[i]);
		}
		
		add(lbl1); add(choice_1);
		add(lbl2); add(choice_2);
		add(lbl3); add(choice_3);
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Choice_2("Choice Test");
	}
}
