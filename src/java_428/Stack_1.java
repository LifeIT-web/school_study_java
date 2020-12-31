package java_428;

import java.util.Stack;
// LIFO
public class Stack_1 {

	public static Stack back =  new Stack(); 
	public static Stack forward =  new Stack();
	
	public static void main(String[] args) {
		
		goURL("1.Google");
		goURL("2.Daum");
		goURL("3.Nate");
		goURL("4.Naver");
		
		printprint();
		
		goBack();
		System.out.println(" 뒤로 가기 1 후 ~~");
		printprint();
		
		goBack();
		System.out.println(" 뒤로 가기 2 후 ~~");
		printprint();
		
		goForward();
		System.out.println(" 앞으로 가기 후 ~~");
		printprint();

		goURL("www.korea.com");
		System.out.println("새로운 주소로 이동 후~~");
		printprint();
		
	}
	// push : 집어넣을때 / pop : 빼낼때
	private static void goForward() {
		if (!forward.empty()) {
			back.push(forward.pop());
		}
	}
	
	private static void goBack() {

		if (!back.empty()) {
			forward.push(back.pop()); 
			// 현재위치의 back에서 하나 끄집어 내서 forward에 집어넣어라
		}
	}
	
	private static void printprint() {
		
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재화면 : " + back.peek() + " 입니다.");
		System.out.println();
	}
	
	private static void goURL(String str) {

		back.push(str); //str값을 back에 넣고
		if (!forward.empty()) { //  forward가 비어있지 않으면
			forward.clear(); // 지워라
		}
	}
}
