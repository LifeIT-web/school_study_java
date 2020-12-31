
public  class  InputOutput

 {

 public static void main(String[]  args) throws Exception

  {
    int  a,b ;
    
    System.out.print("첫문자를 입력하세요");
    a  =  System.in.read ();

    System.in.read();
    System.in.read();

	System.out.print("두뻔째문자를 입력하세요");
    b  =  System.in.read ();


    System.out.println("입력한 문자는 " +(char)a  + "입니다.");
    System.out.println("Ascii  Code  :  "+a+" 입니다.");
    System.out.println("입력한 문자는 " +(char)b  + "입니다.");
    System.out.println("Ascii  Code  :  "+b+" 입니다.");
	

     
  }

}