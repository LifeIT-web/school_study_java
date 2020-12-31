package java_428;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_2 {

	public static void main(String[] args) {
		
		Stack<String> stt = new Stack<String>();
		
		// LinkedList �� Queue �������̽��� ������
		
		Queue<String> qq = new LinkedList<String>();
		
		//���׸� : �����߻� ��Ҹ� ���̱� ���� ����.
		
		stt.push("1"); // Stack�� ��ü�� ����
		stt.push("2");
		stt.push("3"); //  �������� ���� ���� ���´� (LIFO)
		stt.push("4");
		
		qq.offer("1"); // Queue�� ��ü�� ������, �����ϸ� true
		qq.offer("2"); // ���� false
		qq.offer("3"); 
		qq.offer("4");	// �������� �������� (FIFO) <-�ڷᱸ��>
		
		System.out.println("=========Stack==========");
		
		while (!stt.empty()) {
			System.out.println(stt.pop());
			// Stack �� �� ���� ����� ��ü�� ������.
		}
		
		System.out.println("=========Queue==========");
		
		while (!qq.isEmpty()) {
			System.out.println(qq.poll());
			// Queue ���� ������ ��������� ���� �߻�
		}
		
		
	}
}
