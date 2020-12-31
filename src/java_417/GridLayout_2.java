package java_417;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class GridLayout_2 extends Frame{

	public GridLayout_2(String str) {
		super(str);
		setLayout(new GridLayout(4, 2));
		List l1 = new List(5, false);
		Choice cc = new Choice();
		Panel pp = new Panel();
		
		
		add(new Button("Button1"));
		
		l1.add("무궁화"); //꽃이름 5
		l1.add("벚꽃"); 
		l1.add("무지개꽃"); 
		l1.add("똥꽃"); 
		l1.add("개나리"); 
		
		add(l1);
		
		cc.add("리버"); //강이름 5
		cc.add("한강"); //강이름 5
		cc.add("두강"); //강이름 5
		cc.add("세강"); //강이름 5
		cc.add("네강"); //강이름 5

		add(cc);
		
		add(new TextArea("아름다운 모습", 5, 15));
		add(new TextField("TextField"));
		
		pp.add(new Button("시작"));
		pp.add(new Button("종료"));
		
		add(pp);
		
		setSize(300, 300);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new GridLayout_2("그리드레이아아아아웃");
	}
	
}
