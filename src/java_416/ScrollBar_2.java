package java_416;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBar_2 extends Frame implements AdjustmentListener{

	Scrollbar red, green, blue;
	Panel panel1, panel2;
	
	public ScrollBar_2(String title) {

		super(title);
		setLayout(null); // ������ ��ġ ����
		red = new Scrollbar(Scrollbar.HORIZONTAL, 10, 20, 0, 275);
											//  10����, 20���� ũ�� ��(10~30�� ��ũ�ѹ� ũ��)0~275
		green = new Scrollbar(Scrollbar.HORIZONTAL, 10, 20, 0, 275);
		blue = new Scrollbar(Scrollbar.HORIZONTAL, 10, 20, 0, 275);
		// 10 10 10 ���� ������ �ٵ� ������ �Ⱥ��̴� ������ �װͿ� ���� �̺�Ʈ ������ ���س���.
		// ������ ���� �̺�Ʈ�� �߻��ϱ� ������ �� ���� ���� ������ ���Ѵ�.
		
		red.addAdjustmentListener(this); // �̺�Ʈ ������ �ִ� Ŭ������ red�� �ްڴ�.
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		
		panel1 = new Panel();
		panel2 = new Panel();
		panel2.setLayout(new FlowLayout()); // ��ũ�� �� ~ ���� ����
		
		panel1.setLocation(10, 10);
		panel1.setSize(200, 200);// ���� �����ִ� ũ��
		panel2.setLocation(10, 230);
		panel2.setSize(200, 300); // ��ũ�Ѹ� ������ �г� ũ��
		
		panel2.add(red);
		panel2.add(green);
		panel2.add(blue);		
		
		add(panel1);
		add(panel2);
		
//		add("Center", panel1);
//		add("South", panel2);
		
		setSize(300, 300);
		setVisible(true);
	}	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// ��ũ�� �� �̵������� �̺�Ʈ�� �����ϰٴ�.
		panel1.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
		
		System.out.println("�� : " + red.getValue());
		System.out.println("�� : " + green.getValue());
		System.out.println("�� : " + blue.getValue());
		System.out.println();
	}
	
	public static void main(String[] args) {
		new ScrollBar_2("Scrollbar Test!!");
	}

	
	
}
