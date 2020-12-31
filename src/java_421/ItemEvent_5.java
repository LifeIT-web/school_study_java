package java_421;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_5 extends Frame implements ItemListener{

	Checkbox[] os = new Checkbox[5];
	Checkbox[] cpu = new Checkbox[3];
	Checkbox[] flw = new Checkbox[3];
	
	CheckboxGroup cbg;
	
	Label lbl_info;
	
	String[] os_str = {"������ 98", "������", "������10", "MS_DOS", "������ XP"};
	String[] cpu_str = {"AMD","����","���̸���"};
	String[] flw_str = {"��","Flower","Tree"};
	
	int i;
	
	public ItemEvent_5(String title) {
		super(title);
				
		Label lbl = new Label("��ġ�� �ü���� cpu�� ������");
		lbl_info = new Label();
		
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		Panel panel3 = new Panel();
		Panel panel4 = new Panel();
		
		for (int i = 0; i < os.length; i++) {
			os[i] = new Checkbox(os_str[i]);
			panel1.add(os[i]);
			os[i].addItemListener(this);
		}

		
		cbg = new CheckboxGroup();
		
		for (int i = 0; i < cpu.length; i++) {
			cpu[i] = new Checkbox(cpu_str[i], cbg, (i==2) ? true : false);
			//  checkbox �� 2���� true���� �ְ� �ʹ�. �׷� ���� �� 2���� üũ��
			panel2.add(cpu[i]);
			cpu[i].addItemListener(this);
			
		}

		for (int i = 0; i < flw.length; i++) {
			flw[i] = new Checkbox(flw_str[i]);
			panel4.add(flw[i]);
			flw[i].addItemListener(this);
		}
		
		panel3.add(panel1);
		panel3.add(panel2);
		panel3.add(panel4);
		// �г�3�̶�� ���� �ȿ� �г�1 , 2 �� ��.
				
		add("North", lbl);
		add("Center", panel3);
		add("South", lbl_info);
		
		setSize(400, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ItemEvent_5("itemevent");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		String msg = "����� ��ǻ�� os �� : ";
		for (int i = 0; i < os.length; i++) {
			if (os[i].getState()) {
				msg += "[" + os[i].getLabel() + "]";
			}
		}
		
		for (int i = 0; i < cpu.length; i++) {
			if (cpu[i].getState()) {
				msg += ", CPU : " + cpu[i].getLabel() + " �̰�";
			}
		}

		for (int i = 0; i < flw.length; i++) {
			if (flw[i].getState()) {
				msg += ", �� : " + flw[i].getLabel() + " �Դϴ�.";
			}
		}
		
		lbl_info.setText(msg);
		
	}
	
	
	
			
}
