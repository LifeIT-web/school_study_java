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
		
		System.out.print("���̸� �Է� �Ͻÿ� ");
		int age = input.nextInt();
		
		String jj = " ";
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		if (age >= 0 && age <=19) 
			jj = "�л�";
		
		else if (age >=20 && age <=39) 
			jj = "û��";
		
		else
			jj = "����";
		System.out.println("���� : " + jj);
		System.out.println("���� : " + sex);
	}
}
