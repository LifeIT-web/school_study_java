package java_402;

class A_1 // A_1 class
{
	int a = 11; // Member of A_1 class
	
}

class B_1 extends A_1 // B_1 class 
{
	int b = 33; // Member of B_1 class
}

class C_1 extends B_1
{
	int c = 55;
}

public class D_Exe {
	
	public static void main(String[] args) {
	
		C_1 obj = new C_1();
		
		System.out.println("obj ÀÇ ¸É¹öº¯¼ö a : " + obj.a);
		System.out.println("obj ÀÇ ¸É¹öº¯¼ö b : " + obj.b);
		System.out.println("obj ÀÇ ¸É¹öº¯¼ö c : " + obj.c);
	}
}
