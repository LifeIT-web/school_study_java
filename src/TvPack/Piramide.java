package TvPack;

public class Piramide {

	public static void main(String[] args) {
		
		int num = 5;
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 1; j < num - i ; j++) {
				
				System.out.print(" ");
			}
			
			for (int k = 0; k < i * 2 + 1 ; k++) {
				System.out.print("*");
			} 
			
			System.out.println();
		
		}
		
		int num2 = 4;
		
		for (int i = num2; i > 0; i--) {
			
			for (int j = num - i; j > 0 ; j--) {
				
				System.out.print(" ");
			}
			
			for (int k = i * 2 - 1; k > 0 ; k--) {
				System.out.print("*");
			} 
			
			System.out.println();
		
		}
	}
}
