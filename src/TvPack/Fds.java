package TvPack;

public class Fds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 2; //011 , 버리는 게 아니라 돌고 온다. 근데  >> 은 안돌아옴
		
		char s = 'A';
		
		System.out.println(1 + x << 33); // 0으로 채워짐
		System.out.println(s++);
		System.out.println(++s);
		System.out.println(s);
	}

}
