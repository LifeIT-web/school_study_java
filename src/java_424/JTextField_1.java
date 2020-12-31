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
		setTitle("���� ����ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ButtonListener listener = new ButtonListener();
		
		
		JPanel panel = new JPanel();
		
		panel.add(new JLabel("���� �Է� 1:"));
		text1 = new JTextField(15);
		text1.addActionListener(listener);
		panel.add(text1);

		panel.add(new JLabel("���� �Է� 2:"));
		text2 = new JTextField(15);
		text2.addActionListener(listener);
		panel.add(text2);
		
		panel.add(new JLabel("���� ��: "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	
	//���� Ŭ�����μ� �ؽ�Ʈ �ʵ�� ��ư�� �׼� �̺�Ʈ ó��
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Object obj = e.getSource();
			
			if (obj == button || obj == text1 || obj == text2) {
				
				String name = text1.getText();
				String name1 = text2.getText();
				int value1 = Integer.parseInt(name);
				int value2 = Integer.parseInt(name1);
				
				result.setText(" " + value1 * value2); // ���� * ���� �� �켱 ��, ������ �켱������ ������ ����
				
				text1.requestFocus(); // Focus �ؽ�Ʈ�� ����
				text1.selectAll(); //  �Է��ϰ� ������ų�� ��
				
				text2.selectAll(); //  �Է��ϰ� ������ų�� ��

			}
		}

		
	}
	
	public static void main(String[] args) {
		new JTextField_1(); 
	}
}
