package TvPack;

public class Member {

	String  name;
	String id;
	
	
	public Member(String name, String id) {
		
		this.name = name;
		this.id = id;
	}
	
	
	public static void main(String[] args) {
	
		Member user1 = new Member("홍길동",  "hong");
		Member user2 = new Member("강자바",  "java");
		
		System.out.println(user1.name);
		System.out.println(user1.id);
		System.out.println(user2.name);
		System.out.println(user2.id);
	}
		
}

