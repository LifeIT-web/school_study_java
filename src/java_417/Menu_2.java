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
		Menu file = new Menu("파일");
		
		CheckboxMenuItem file_now = new CheckboxMenuItem("새 파일", true);
		CheckboxMenuItem file_open = new CheckboxMenuItem("불러오기");
		// 중복 체크됨
		MenuItem file_separator = new MenuItem("-"); // separator 특수기호는 '-'만 가능
		
		file.add(file_now);
		file.add(file_open);
		file.add(file_separator);
		
		
		Menu edit = new Menu("편집"); // 메뉴안에 메뉴를 만들수 있다.
		MenuItem edit_cut = new MenuItem("오려두기");
		MenuItem edit_paste = new MenuItem("붙이기");

		edit.add(edit_cut);
		edit.add(edit_paste);
		
		Menu close = new Menu("파일 닫기");
		MenuItem close_close = new MenuItem("닫기");
		MenuItem close_mulla = new MenuItem("몰라");
		
		close.add(close_close);
		close.add(close_mulla); 
		
		file.add(close);
		file.add(edit); //출력 순서 결정
		
		mb.add(file);
		
		setMenuBar(mb);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Menu_2("메뉴뉴뉴우우우우");
	}

}
