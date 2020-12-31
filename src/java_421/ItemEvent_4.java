package java_421;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_4 extends Frame implements ItemListener {

	Choice lst_1, lst_2, lst_3;
	Label lbl_info;

	String[] 대륙 = { "아시아", "유럽", "아프리카" };
	String[][] 나라 = { { "한국", "중국", "필리핀" }, { "스위스", "영국", "프랑스" }, { "이집트", "콩고", "우간다" } };
	String[][] 수도 = {{"서울", "베이징", "마닐라"}, {"베른", "런던", "파리"}, {"카이로", "킨샤사", "캄팔라"}};
	
	public ItemEvent_4(String str) {
		super(str);
		Label lbl = new Label("대륙과 나라를 선택해");
		Panel panel = new Panel();

		lbl_info = new Label();
		lst_1 = new Choice();
		lst_2 = new Choice();
		lst_3 = new Choice();

		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		lst_3.addItemListener(this);

		for (int i = 0; i < 대륙.length; i++) {
			lst_1.add(대륙[i]);
		}

		lst_2.add("          ");
		panel.add(lst_1);
		panel.add(lst_2);
		lst_3.add("          ");
		panel.add(lst_3);
		

		add("North", lbl);
		add("Center", panel);
		add("South", lbl_info);

		setSize(500, 200);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		Choice obj = (Choice) e.getSource();
		String str = "선택한 대륙과 나라는 : ";

		if (obj == lst_1) {
			lst_2.removeAll(); // 오른쪽 패널 데이터 출력 공간을 지워라
			int j = lst_1.getSelectedIndex(); // 인덱스 값 넣어라
			for (int i = 0; i < 나라[j].length; i++) {
				lst_2.add(나라[j][i]); // 나라[인데스값을 넣은]배열에 있는 데이터 출력
			}
		}
		else if (obj == lst_2) {

			lst_3.removeAll(); // 오른쪽 패널 데이터 출력 공간을 지워라
			int j = lst_2.getSelectedIndex(); // 인덱스 값 넣어라
			for (int i = 0; i < 수도.length; i++) {		
				lst_3.add(수도[j][i]); // 나라[인데스값을 넣은]배열에 있는 데이터 출력
			}
		}
		else {
			str += lst_1.getSelectedItem();
			str += " - " + lst_2.getSelectedItem(); // 그 방에 있는 데이터 값을 넣어라
			str += " - " + lst_3.getSelectedItem(); // 그 방에 있는 데이터 값을 넣어라
			lbl_info.setText(str);
		}
	}

	public static void main(String[] args) {
		new ItemEvent_4("아이템 이벤트 테스트");
	}
}