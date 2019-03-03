package practiseDemo;

public class Pyramid {

	public static void main(String[] args) {
		int arr=10;
		for (int i = 1; i<= arr; i++) {
			for (int j = 0; j <= arr-i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i-1; j++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
		for (int j = 0; j <= arr; j++) {
			System.out.print(" *");
			
		}System.out.print("\n");
		for (int i = 1; i<= arr; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= arr-i; j++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
		

	}

}
