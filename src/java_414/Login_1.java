package java_414;

import java.awt.Frame;
import java.awt.Label;

public class Login_1 {

	public static void main(String[] args) {
		
		Frame ff = new Frame("Login");
		
		ff.setSize(300, 200);
		ff.setLayout(null); 
		// �������� ��ġ�� �״�� ����ϰڴ�.
		// null�� �ϰԵǸ� ȭ��ٲܶ� �̵��� �ȵǾ� ȭ�鿡 ����� �ȵȰ�ó�� ���ϼ� �ֱ⿡ �� �Ⱦ�.
		// FlowLayout�� ���� �¿��� ��� �״�� ����Ʈ�Ǳ⿡ setBounds�� �ǹ̰� ������.
		
		Label id = new Label("ID : ");
		id.setBounds(100, 100, 30, 18);  // ������Ʈ ��ġ���� �� ũ�⼳��
					//x , y ,  ����, ����
					// ���� 100, ���� 100 �̵��ϰ� ���� 30, ���� 18�� ���̺��� �����ϰڴ�.
		
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
