package java_ex;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while (true) {
			System.out.println("==============================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
			System.out.println("==============================================");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();
				
			} else if (selectNo == 2) {
				accountList();
				
			} else if (selectNo == 3) {
				deposit();
				
			} else if (selectNo == 4) {
				withdrow();
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		Account obj = new Account("111-111", "홀길동", 10000);
		
		System.out.println("==============");
		System.out.println("계좌생성");
		System.out.println("==============");
		System.out.println("계좌번호 : " + obj.getAno());
		System.out.println("계좌주 : " + obj.getOwner());
		System.out.println("초기입금액 : " + obj.getBalance());
		System.out.println("계좌가 생성되었습네다.");
	}
	
	//계좌 목록보기
	private static void accountList() {
		
	}
	
	//예금하기
	private static void deposit() {
		
	}
	
	//출금하기
	private static void withdrow() {
		
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		
		
	}
}
