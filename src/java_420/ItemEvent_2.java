package java_420;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class ItemEvent_2 extends Frame{

	CheckboxGroup group;
	Checkbox cb1, cb2, cb3, cb4, cb5;
	
	public ItemEvent_2(String title) {
		super(title);
		
		group = new CheckboxGroup();
		cb1 = new Checkbox("red", group, false);
		cb2 = new Checkbox("green", group, true);
		cb3 = new Checkbox("blue", group, false);
		cb4 = new Checkbox("dung", group, false);
		cb5 = new Checkbox("white blue", group, false);
		
		cb1.addItemListener(new Handler());
		cb2.addItemListener(new Handler());
		cb3.addItemListener(new Handler());
		cb4.addItemListener(new Handler());
		cb5.addItemListener(new Handler());
		
		setLayout(new FlowLayout());
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
			
		setBackground(Color.gray);
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new ItemEvent_2("아이템 이벤트 라디오 버전");
	}
	
	class Handler implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e) {

			Checkbox cb = (Checkbox) e.getSource();
			
			String color = cb.getLabel();
			
			if (color.equals("red")) {
				setBackground(Color.red);
				
			}
			else if (color.equals("green")) {
				setBackground(Color.green);
			}
			else if(color.equals("blue"))
			{
				setBackground(Color.blue);
			}
			else if(color.equals("dung"))
			{
				setBackground(new Color(202, 187, 78));
			}
			else
			{
				setBackground(new Color(167, 255, 255));
			}
		}
		
	}
}
