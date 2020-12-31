package java_428;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_2 {

	public static void main(String[] args) {
		
		Stack<String> stt = new Stack<String>();
		
		// LinkedList 는 Queue 인터페이스를 구현함
		
		Queue<String> qq = new LinkedList<String>();
		
		//제네릭 : 문제발생 요소를 줄이기 위해 쓴다.
		
		stt.push("1"); // Stack에 객체를 저장
		stt.push("2");
		stt.push("3"); //  마지막에 들어간게 먼저 나온다 (LIFO)
		stt.push("4");
		
		qq.offer("1"); // Queue에 객체를 저장함, 성공하면 true
		qq.offer("2"); // 실패 false
		qq.offer("3"); 
		qq.offer("4");	// 먼저들어간게 먼저나옴 (FIFO) <-자료구조>
		
		System.out.println("=========Stack==========");
		
		while (!stt.empty()) {
			System.out.println(stt.pop());
			// Stack 의 맨 위에 저장된 객체를 꺼낸다.
		}
		
		System.out.println("=========Queue==========");
		
		while (!qq.isEmpty()) {
			System.out.println(qq.poll());
			// Queue 에서 꺼낸다 비어있으면 예외 발생
		}
		
		
	}
}
