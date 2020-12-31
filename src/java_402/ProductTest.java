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
		
		System.out.println("pro_1의 제품번호(serialNo) : " + pro_1.serialNo);
		System.out.println("pro_2의 제품번호(serialNo) : " + pro_2.serialNo);
		System.out.println("pro_3의 제품번호(serialNo) : " + pro_3.serialNo);
	}
}
