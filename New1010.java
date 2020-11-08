import java.util.Scanner;

public class New1010 {
	private static int digit1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		int digital1 = sc.nextInt();
		System.out.println("Enter second digit");
		int digit2 = sc.nextInt();
	    int sum = digit1 + digit2;
		System.out.println("The sum of the digits is: " + sum);
	
	}
}