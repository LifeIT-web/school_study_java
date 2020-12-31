package java_414;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Label_1 {

	public static void main(String[] args) {
		
		Label label1, label2, label3, label4;
		
		Frame ff = new Frame("내가 만든 레이블 ~~~~~");
		
		ff.setLayout(new FlowLayout());
		
		label1 = new Label("봄");
		label2 = new Label("여름");
		label3 = new Label("가을");
		label4 = new Label("겨울");
		
		ff.setBackground(new Color(200, 181, 73)); // 프레임 배경의 색깔
		label1.setBackground(new Color(255, 167, 167)); // 레이블 내부 배경의 색깔
		label2.setBackground(new Color(175, 255, 255)); // 레이블 내부 배경의 색깔
		label3.setBackground(new Color(242 , 203, 97)); // 레이블 내부 배경의 색깔
		label4.setBackground(new Color(255, 255, 255)); // 레이블 내부 배경의 색깔
		label1.setForeground(new Color(0, 0, 0)); // 글자 색깔 (전경색)
		label2.setForeground(new Color(0, 0, 0)); // 글자 색깔 (전경색)
		label3.setForeground(new Color(0, 0, 0)); // 글자 색깔 (전경색)
		label4.setForeground(new Color(0, 0, 0)); // 글자 색깔 (전경색)
		
		ff.add(label1);
		ff.add(label2);
		ff.add(label3);
		ff.add(label4);
		
		ff.setSize(300, 200);
		ff.setVisible(true);
	}
}
