package java_422;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEvent_2 extends Frame{

	public WindowEvent_2(String title) {
		super(title);
		
		addWindowListener(new Handler());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowEvent_2("������ �̺�Ʈ �׽�Ʈ");
	}
	
	class Handler extends WindowAdapter{ 
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("������ �ݱ�");
			System.exit(0); // ���α׷� ����
		}
		//  �ƴ��� Ŭ���� �뵵��  �̺�Ʈ�ȿ� �ִ� �ʿ��� �޼ҵ� �ϳ��� �ΰ� ���� ��� ������ �ͼ� ���� ����
		//  ������ �������̽� ����ȭ �ؼ� ��� �޼ҵ带 �������̵� �ߴٸ�
		//  �̰��� �ƴ��� Ŭ������ �̿��Ͽ� �ʿ��� �޼ҵ常 ������ �����ų �� ����.		
	}
	
}
