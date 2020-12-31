package java_414;

import java.awt.Color;
import java.awt.Frame;

public class Frame_2 {

	public static void main(String[] args) {

		Frame ff = new Frame("아름다운 철쭉");
		
		ff.setBackground(new Color(205, 25, 25));
		
		ff.setLocation(400, 400); // 컴포넌트 위치지정
		ff.setSize(300, 300); // 컴포넌트 크기지정
		ff.setVisible(true);
	}
}
