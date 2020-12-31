package java_331;

import java.util.Scanner;

class PracticeEx {

	private String name;
	
	private char sex;
	
	public PracticeEx(String n,  char s)
	{
		name = n;
		sex = s;
	}
	
	public void display1()
	{
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("나이를 입력 하시오 ");
		int age = input.nextInt();
		
		String jj = " ";
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		if (age >= 0 && age <=19) 
			jj = "학생";
		
		else if (age >=20 && age <=39) 
			jj = "청년";
		
		else
			jj = "노인";
		System.out.println("직업 : " + jj);
		System.out.println("성별 : " + sex);
	}
}
