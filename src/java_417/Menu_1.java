package java_417;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_1 extends Frame{
	
	public Menu_1(String title) {
		super(title);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("����");
		
		MenuItem file_new = new MenuItem("�� ����");
		MenuItem file_open = new MenuItem("�ҷ�����");
		MenuItem file_close = new MenuItem("���ϴݱ�");
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_close);

		Menu edit = new Menu("����");
		
		MenuItem edit_cut = new MenuItem("�����α�");
		MenuItem edit_paste = new MenuItem("���̱�");
		
		edit.add(edit_cut);
		edit.add(edit_paste);
				
		Menu exe = new Menu("����");
		
		MenuItem exe_exe = new MenuItem("�����ϱ�");
		MenuItem exe_cancel = new MenuItem("����ϱ�");
		MenuItem exe_stay = new MenuItem("�׷��� �α�");
		
		exe.add(exe_exe);
		exe.add(exe_cancel);
		exe.add(exe_stay);
		
		mb.add(file);
		mb.add(edit);
		mb.add(exe);
		
		setMenuBar(mb);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Menu_1("�޿���������������������������");
				
	}

}
