package java_417;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_2 extends Frame{
	
	public Menu_2(String title) {
		super(title);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("����");
		
		CheckboxMenuItem file_now = new CheckboxMenuItem("�� ����", true);
		CheckboxMenuItem file_open = new CheckboxMenuItem("�ҷ�����");
		// �ߺ� üũ��
		MenuItem file_separator = new MenuItem("-"); // separator Ư����ȣ�� '-'�� ����
		
		file.add(file_now);
		file.add(file_open);
		file.add(file_separator);
		
		
		Menu edit = new Menu("����"); // �޴��ȿ� �޴��� ����� �ִ�.
		MenuItem edit_cut = new MenuItem("�����α�");
		MenuItem edit_paste = new MenuItem("���̱�");

		edit.add(edit_cut);
		edit.add(edit_paste);
		
		Menu close = new Menu("���� �ݱ�");
		MenuItem close_close = new MenuItem("�ݱ�");
		MenuItem close_mulla = new MenuItem("����");
		
		close.add(close_close);
		close.add(close_mulla); 
		
		file.add(close);
		file.add(edit); //��� ���� ����
		
		mb.add(file);
		
		setMenuBar(mb);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Menu_2("�޴����������");
	}

}
