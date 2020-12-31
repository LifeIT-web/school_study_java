package java_428;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {

	public static void main(String[] args) throws InterruptedException{
		
		int time = 10;
		Queue<Integer> qq = new LinkedList<Integer>();
		
		for (int i = 0; i < time; i++) {
			qq.add(i);
		}
		
		/*
		 * for (int i = 1; i < time ; i ++)
		 * { qq.offer(i);} //  집어 넣는다.
		 * */
		
		while (!qq.isEmpty()) { 
			// 큐에 아무것도 들어 있지 않다면
			
			// 큐 : FIFO 먼저 들어간게 먼저 나온다.
			
			System.out.println(qq.poll() + " aaa "); //  빼낸다.
							// 큐에선 remove()보단 poll()을 쓴다.(= 위 아래 같다.)
//			System.out.println(qq.remove() + " 333 ");
			System.out.println(qq);
			
			Thread.sleep(1000);
		}
	}
	
}
