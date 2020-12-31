package java_416;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayout_1 extends Frame{
	
	FlowLayout flw = new FlowLayout();
	
	Button[] btn = new Button[10];
	
	public FlowLayout_1(String name) {
		super(name);
		setLayout(flw); // null를 넣게 되면 좌표값이 없어 어디서 나오는지 알수 없다.
		// setLayout를 주석처리하면 0~9까지 겹처서 나오기 때문에 
		// 하나가 나온것처럼 보이게 된다.
		// 9버튼만 나오게 됨
		for (int i = 0; i < 10; i++) {
			btn[i] = new Button(i + " 버튼");
			add(btn[i]);
		}
		
		setBounds(200, 200, 150, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayout_1("FlowLayout 이라네 ~~~~");
	}

}
