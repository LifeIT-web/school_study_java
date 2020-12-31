package java_414;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
// List임 실행해보기
public class List_1 extends Frame{
	
	public List_1(String str) {

		super(str);
		
		setLayout(new FlowLayout());
		
		List list = new List(4, true);
					//첨에 보여주는 갯수 // true 다중 선택 가능  false 선택 한개.
		
		List list1 = new List(3, false);
					//첨에 보여주는 갯수 // true 다중 선택 가능  false 선택 한개.
		
		Label lbl = new Label("List Test");
		Label lbl1 = new Label("꽃이라네");
		
		add(lbl);
		
		list.add("386DX");
		list.add("486DX");
		list.add("486DX");
		list.add("펜티엄4");
		list.add("에슬론XP3");
		list.add("듀얼코어");
		list.add("라이젠");
		list.add("슈퍼");
		
		add(list);

		add(lbl1);
		
		list1.add("천리향");
		list1.add("벛꽃");
		list1.add("라일락");
		list1.add("개나리");
		list1.add("단풍");
		list1.add("무궁화");
		list1.add("수선화");
		list1.add("나무");
		
		
		add(list1);
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new List_1("List Test");
		
	}

}
