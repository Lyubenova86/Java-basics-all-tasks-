	import java.util.Scanner;

	public class Triagle2 {

		int height;
		int length;
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter height");
			int height = sc.nextInt();
			
			System.out.println("Enter length");
			int length = sc.nextInt();

			System.out.println("Triangle lice is: " + (height * length)/2);
			
		}
	}
		

