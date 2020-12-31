package java_504;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends Frame implements ActionListener, Runnable{

	Button btn_exit; // ���� ��ư
	Button btn_send; // ���ڿ� ����
	Button btn_connect; // ���� ����
	TextArea txt_list; // ���� ��� ���
	TextField txt_server_ip; // ���� ���� ������
	TextField txt_name; // ���� �̸�
	TextField txt_input; // ���� �޽���
	Socket client; // ���� Ŭ���̾�Ʈ ����
	BufferedReader br = null; // �о���� ��Ʈ��
	PrintWriter pw = null; // ������ ��Ʈ��
	String server_ip = null; // ���� ������
	final int port = 4561; //  �ٸ� ������ �����Ϸ��� ��Ʈ ��ȣ
	
	CardLayout cl; // ī�� ���̾ƿ� ����
	
	// ������
	public ChatClient(String title) {
		super(title); // Ÿ��Ʋ �� ����
		cl = new CardLayout(); // ī�� ���̾ƿ� �ʱ�ȭ
		setLayout(cl); // ���̾ƿ� ����
		Panel connect = new Panel(); // ���� ȭ��
		connect.setLayout(new BorderLayout());
		Panel chat = new Panel(); // ä�� ȭ��
		chat.setLayout(new BorderLayout());
		
		btn_connect = new Button("���� ����"); // ��ư ����
		btn_connect.addActionListener(this); // �̺�Ʈ ���
		txt_server_ip = new TextField("192.168.0.92", 15); // 127.0.0.1 , localhost, �� IP�ּ�(IP��� 3���� ���)
						// �ٸ� Ŭ���̾�Ʈ�� �� PC�� �����ϰ� ������ �� PC�� IP�ּҸ� �˾ƾ���.
		txt_name = new TextField("������", 15);
		Panel connect_sub = new Panel(); // ����â ���� �г�
		connect_sub.add(new Label("���� ������ : "));
		connect_sub.add(txt_server_ip);
		connect_sub.add(new Label("��ȭ�� : "));
		connect_sub.add(txt_name);
		connect.add("North", new Label("���� ä�� ���� ȭ��", Label.CENTER));
		connect.add("Center", connect_sub);
		connect.add("South", btn_connect);
		
		// ä��â ȭ�� ����
		txt_list = new TextArea();
		txt_input = new TextField("", 25);
		btn_exit = new Button("����");
		btn_send = new Button("����");
		btn_exit.addActionListener(this); // �̺�Ʈ ���
		btn_send.addActionListener(this); // �̺�Ʈ ��� 
		txt_input.addActionListener(this); // �̺�Ʈ ���
		Panel chat_sub = new Panel(); // ä��â ���� �г�
		chat_sub.add(txt_input);
		chat_sub.add(btn_send);
		chat_sub.add(btn_exit);
		chat.add("North", new Label("ä�� ���α׷� ver 1.0", Label.CENTER));
		chat.add("Center", txt_list);
		chat.add("South", chat_sub);
		
		add(connect, "����â"); // ī�� ���̾ƿ��� ���
		add(chat, "ä��â"); // ī�� ���̾ƿ��� ���
		
		cl.show(this, "����â"); // �ʱ�ȭ���� ����â
		
		setSize(400, 300);
		setVisible(true);
		
	}
	// Runnable �������̽� run() �޼��� �������̵� 
	@Override
	public void run() {
		try {
			client = new Socket(server_ip, port); // ���� ����
			// ����� ��Ʈ�� ����
			InputStream is = client.getInputStream();
			OutputStream os = client.getOutputStream();
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(new OutputStreamWriter(os)); 
			String msg = txt_name.getText();
			pw.println(msg);// ��ȭ�� ����
			pw.flush();
			txt_input.requestFocus(); // ä��â �� �Է� ���ڿ� ��Ŀ�� 
			while (true) {
				msg = br.readLine(); // ���� ������ ����
				txt_list.append(msg + "\n");
			}
				
		} catch (IOException e) { // ����ó��
			System.out.print(e.getMessage());
		}
	}
	
	//ActionEvent �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Object obj = e.getSource();
			// ���� ���� ��ư�� ��������
			if (obj == btn_connect) {
				server_ip = txt_server_ip.getText();
				Thread th = new Thread(this);
				th.start(); // ������ ����
				cl.show(this, "ä��â"); // ä��â���� ȭ�� ��ȯ
			}
			// ���� ��ư�� ������ ��
			else if (obj == btn_exit) {
				System.exit(0); // ���α׷� ���� ����
			}
			// ���۹�ư�� ������ ��
			// �� �Է� ���ڿ��� ����Ű�� ������
			else if (obj == btn_send || obj == txt_input) {
				String msg = txt_input.getText();
				pw.println(msg);
				pw.flush();
				txt_input.setText("");
				txt_input.requestFocus();
			}
		} catch (Exception e2) { // ����ó��
			txt_list.append(e2.getMessage() + "\n");
		}
	}

	
	// main() �޼���
	
	public static void main(String[] args) {
		new ChatClient("ä�� Ŭ���̾�Ʈ ���α׷�");
	}
}
