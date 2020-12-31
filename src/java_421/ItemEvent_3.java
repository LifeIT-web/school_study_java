package java_421;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_3 extends Frame implements ItemListener{

	List lst_1, lst_2, lst_3;
	Label lbl_info;
	
	String[] ��� = {"�ƽþ�", "����", "������ī"};
	String[][] ���� = {{"�ѱ�", "�߱�", "�ʸ���"}, {"������", "����", "������"}, {"����Ʈ", "���", "�찣��"}};
	String[][] ���� = {{"����", "����¡", "���Ҷ�"}, {"����", "����", "�ĸ�"}, {"ī�̷�", "Ų����", "į�ȶ�"}};
	
	public ItemEvent_3(String str) {
		super(str);
		Label lbl = new Label("����� ���� ������!");
		Panel panel = new Panel();
		
		lbl_info = new Label();
		lst_1 = new List(2, false);
		lst_2 = new List(3, false);
		lst_3 = new List(3, false);
		
		lst_1.addItemListener(this); // itemStatedChanged method ȣ��
		lst_2.addItemListener(this);
		lst_3.addItemListener(this);
		
		for (int i = 0; i < ���.length; i++) {
			lst_1.add(���[i]);
		}
		
		lst_2.add("          ");
		panel.add(lst_1);
		panel.add(lst_2);
		lst_3.add("          ");
		panel.add(lst_3);
		
		add("North", lbl);
		add("Center", panel);
		add("South", lbl_info);
		
		
		setSize(600, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ItemEvent_3("������ �̺�Ʈ �׽�Ʈ");
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {

		List obj = (List)e.getSource();
		String str = "������ ����� ����� : ";
		
		if (obj == lst_1) {
			lst_2.removeAll(); // ������ �г� ������ ��� ������ ������
			int j = lst_1.getSelectedIndex(); // �ε��� �� �־��
			for (int i = 0; i < ����[j].length; i++) {
				lst_2.add(����[j][i]); // ����[�ε������� ����]�迭�� �ִ� ������ ���
			}
			
		}
		else if (obj == lst_2) {
			lst_3.removeAll(); // ������ �г� ������ ��� ������ ������
			int j = lst_2.getSelectedIndex(); // �ε��� �� �־��
			for (int i = 0; i < ����[j].length; i++) {
				lst_3.add(����[i][j]); // ����[�ε������� ����]�迭�� �ִ� ������ ���
			}
		}
		
		else
		{
			str += lst_1.getSelectedItem();
			str += " - " + lst_2.getSelectedItem(); // �� �濡 �ִ� ������ ���� �־��
			str += " - " + lst_3.getSelectedItem(); // �� �濡 �ִ� ������ ���� �־��
			lbl_info.setText(str);
		}
	}	
}
