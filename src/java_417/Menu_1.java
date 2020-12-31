package java_417;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_1 extends Frame{
	
	public Menu_1(String title) {
		super(title);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("파일");
		
		MenuItem file_new = new MenuItem("새 파일");
		MenuItem file_open = new MenuItem("불러오기");
		MenuItem file_close = new MenuItem("파일닫기");
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_close);

		Menu edit = new Menu("편집");
		
		MenuItem edit_cut = new MenuItem("오려두기");
		MenuItem edit_paste = new MenuItem("붙이기");
		
		edit.add(edit_cut);
		edit.add(edit_paste);
				
		Menu exe = new Menu("실행");
		
		MenuItem exe_exe = new MenuItem("실행하기");
		MenuItem exe_cancel = new MenuItem("취소하기");
		MenuItem exe_stay = new MenuItem("그래로 두기");
		
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
		new Menu_1("메에에에에에뉴뉴뉴유유유유우우우");
				
	}

}
