package java_504;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer extends Frame implements ActionListener{

	Button btn_ext; // ���� ��ư
	TextArea txt_list; // ���� ��� ���
	protected Vector list; // ������ ���� ��� ����
	
	// ������
	public ChatServer(String title) {
		super(title); // Ÿ��Ʋ�ٿ� ��µ� ���ڿ�
		list = new Vector(); // ���� ����
		btn_ext = new Button("���� ����"); // ���� ���� ��ư ����
		btn_ext.addActionListener(this);// �̺�Ʈ ���
		txt_list = new TextArea(); // txt_list ����
		add("Center", txt_list); // ȭ�� ��� txt_list ���
		add("South", btn_ext);
		setSize(200, 200);
		setVisible(true);
		ServerStart(); // ä�� ���� ����
		
	}
	
	//ä�� ����
	public void ServerStart() {

		final int port = 4561; // ä�� ���� ��Ʈ ��� ���� (1000~10000) , �� ���� ��Ʈ��ȣ
		try {
			ServerSocket ss = new ServerSocket(port); // ServerSocket ����
			while (true) {
				Socket client = ss.accept(); // Ŭ���̾�Ʈ ���� ��ٸ�
				txt_list.append(client.getInetAddress().getHostAddress() + "\n");
				ChatHandle ch = new ChatHandle(this, client); // ChatHandler �ʱ�ȭ
				list.addElement(ch); // Ŭ���̾�Ʈ ���� list ���� �߰�
				ch.start(); // ChatHandle ������ ����
			}
		} catch (Exception e) { // ���� ó��
			System.out.println(e.getMessage());
		}
	}
	
	//���� ���� ��ư�� ��������
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	//�޽��� ��� �޼ҵ�
	public void SetMsg(String msg) {
		txt_list.append(msg + "\n"); // ȭ�鿡 msg �޽��� ���
	}
	
	// main �޼ҵ�
	public static void main(String[] args) {
		new ChatServer("ä�� ����");
	}
	
}

// ChatHandle Ŭ����
// ä�� ������ �������� ���� ó��

class ChatHandle extends Thread{ // ������ ���
	
	ChatServer server = null; // GUIChatServer �������
	Socket client = null; // ������ Ŭ���̾�Ʈ
	BufferedReader br = null; // �о����
	PrintWriter pw = null; // ������
	
	// ������
	public ChatHandle(ChatServer server, Socket client) throws IOException {
		this.server = server;
		this.client = client;
		//����� ��Ʈ�� ����
		InputStream is = client.getInputStream();
		br = new BufferedReader(new InputStreamReader(is));
		
		OutputStream os = client.getOutputStream();
		pw = new PrintWriter(new OutputStreamWriter(os));
	}	
	
	//���� ������ ������ ��� Ŭ���̾�Ʈ�� msg����
	public void Send_All(String msg) {
		try {
			synchronized (server.list) { // ChatServer ������� list
				int size = server.list.size(); // ���� ������ Ŭ���̾�Ʈ ��
				 for (int i = 0; i < size; i++) {
					ChatHandle chs = (ChatHandle) server.list.elementAt(i);
					synchronized (chs.pw) { // ChatHandle pw �ν��Ͻ��� �̿��� ���� ����
						chs.pw.println(msg);
						
					}
					chs.pw.flush();
				}
			}
		} catch (Exception e) { // ����ó��
			System.out.println(e.getMessage());
		}
	}
	
	// Thread Ŭ������ run �޼ҵ� �������̵�
	@Override
	public void run() {
		
		String name = "";
		
		try {
		
			name = br.readLine(); // ��ȭ�� �о����
			Send_All(name + " ���� ���� �����ϼ̽��ϴ�.");
			
			while (true) {
				
				String msg = br.readLine(); // Ŭ���̾�Ʈ �޽��� ���
				String str = client.getInetAddress().getHostName();
				synchronized (server) {
					server.SetMsg(str + " : " + msg); // ���� Ŭ���̾�Ʈ �޽��� ���
				}
				if (msg.equals("@@Exit")) { // @@Exit �޽����� Ŭ���̾�Ʈ ���� ����
					break;
					
				}else { // ���� ������ ��� Ŭ���̾�Ʈ�� �޽��� ����
					Send_All(name + " >> " + msg);
				}
			}
		} catch (Exception e) { // ���� ó��
			
			server.SetMsg(e.getMessage());
			
		} finally {
			
			synchronized (server.list) {
				server.list.removeElement(this); // ���� ��Ͽ��� ����
			}
			try { // ��Ʈ�� ����
				br.close();
				pw.close();
				client.close(); // Ŭ���̾�Ʈ ���� ����
			} catch (IOException e2) { // ����ó��
				server.SetMsg(e2.getMessage());
			}
			
		}
	}
}
