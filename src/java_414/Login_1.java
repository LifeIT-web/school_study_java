package java_414;

import java.awt.Frame;
import java.awt.Label;

public class Login_1 {

	public static void main(String[] args) {
		
		Frame ff = new Frame("Login");
		
		ff.setSize(300, 200);
		ff.setLayout(null); 
		// 임의적인 위치에 그대로 출력하겠다.
		// null로 하게되면 화면바꿀때 이동이 안되어 화면에 출력이 안된것처럼 보일수 있기에 잘 안씀.
		// FlowLayout를 쓰면 좌에서 우로 그대로 프린트되기에 setBounds의 의미가 없어짐.
		
		Label id = new Label("ID : ");
		id.setBounds(100, 100, 30, 18);  // 컴포넌트 위치지정 및 크기설정
					//x , y ,  넓이, 높이
					// 가로 100, 세로 100 이동하고 가로 30, 높이 18의 레이블을 생성하겠다.
		
		Label pwd = new Label("Password : ");
		pwd.setBounds(100, 120, 100, 18);
		
		Label adr = new Label("Address : ");
		adr.setBounds(100, 140, 100, 18);
		
		ff.add(id);
		ff.add(pwd);
		ff.add(adr);
		
		ff.setVisible(true);
	}
}
