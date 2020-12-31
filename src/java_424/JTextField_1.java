package java_424;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextField_1 extends JFrame{

	private JButton button;
	private JTextField text1, text2 ,result;
	
	public JTextField_1() {
		
		setSize(300, 200);
		setTitle("제곱 계산하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ButtonListener listener = new ButtonListener();
		
		
		JPanel panel = new JPanel();
		
		panel.add(new JLabel("숫자 입력 1:"));
		text1 = new JTextField(15);
		text1.addActionListener(listener);
		panel.add(text1);

		panel.add(new JLabel("숫자 입력 2:"));
		text2 = new JTextField(15);
		text2.addActionListener(listener);
		panel.add(text2);
		
		panel.add(new JLabel("곱한 값: "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	
	//내부 클래스로서 텍스트 필드와 버튼의 액션 이벤트 처리
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Object obj = e.getSource();
			
			if (obj == button || obj == text1 || obj == text2) {
				
				String name = text1.getText();
				String name1 = text2.getText();
				int value1 = Integer.parseInt(name);
				int value2 = Integer.parseInt(name1);
				
				result.setText(" " + value1 * value2); // 숫자 * 숫자 가 우선 단, 연산자 우선순위가 있으니 주의
				
				text1.requestFocus(); // Focus 텍스트에 고정
				text1.selectAll(); //  입력하고 반전시킬때 씀
				
				text2.selectAll(); //  입력하고 반전시킬때 씀

			}
		}

		
	}
	
	public static void main(String[] args) {
		new JTextField_1(); 
	}
}
