package java_414;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CheckBox_2 extends Frame{
	
	Checkbox cbx1, cbx2, cbx3, cbx4, cbx5, cbx6, cbx7, cbx8;
	CheckboxGroup cbg; // 4���� �ϳ��� ������ �� �ְ� �����ִ� Ŭ���� (���� ��ư)
	CheckboxGroup cbg1;
	
	public CheckBox_2(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("�����ϴ� ������? ", Label.CENTER); //  ���̺� ���� ���� ����
		
		lbl1.setBackground(new Color(255, 200, 80));
		add(lbl1);
		
		
		cbg = new CheckboxGroup();
		cbx1 = new Checkbox("��" ,cbg, true);
		cbx2 = new Checkbox("����" ,cbg, true);
							
		cbx3 = new Checkbox("����" , cbg, true); //  true ������������ �������� üũ
								// �ߺ����� x
		cbx4 = new Checkbox("�ܿ�" , cbg, false);
		
		add(cbx1); add(cbx2);
		add(cbx3); add(cbx4);
		
		Label lbl2 = new Label("�����ϴ� ����? ", Label.CENTER); //  ���̺� ���� ���� ����
		
		lbl2.setBackground(new Color(200, 200, 80));
		add(lbl2);
		
		cbg1 = new CheckboxGroup();
		cbx5 = new Checkbox("��λ�" ,cbg1, true);
		cbx6 = new Checkbox("�Ѷ��" ,cbg1, true);
		
		cbx7 = new Checkbox("���ѻ�" , cbg1, true); //  true ������������ �������� üũ
		// �ߺ����� x
		cbx8 = new Checkbox("�¹��" , cbg1, false);
		

		add(cbx5); add(cbx6);
		add(cbx7); add(cbx8);
		
		setSize(240, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new CheckBox_2("üũ�ڽ� ����");
	}
}
