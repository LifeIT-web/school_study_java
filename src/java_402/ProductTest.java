package java_402;

class Product
{
	static int count = 0;
	int serialNo;
	
	{	
		++count;
		serialNo = count;
	}
	
	public Product() {
	}
	
}


public class ProductTest {

	public static void main(String[] args) {
		
		Product pro_1 = new Product();
		Product pro_2 = new Product();
		Product pro_3 = new Product();
		
		System.out.println("pro_1�� ��ǰ��ȣ(serialNo) : " + pro_1.serialNo);
		System.out.println("pro_2�� ��ǰ��ȣ(serialNo) : " + pro_2.serialNo);
		System.out.println("pro_3�� ��ǰ��ȣ(serialNo) : " + pro_3.serialNo);
	}
}
