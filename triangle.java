import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This will calculate perimeter of triangle");
		System.out.println("Enter side A :");
		int sideA = sc.nextInt();
		System.out.println("Enter side B :");
		int sideB = sc.nextInt();
		System.out.println("Enter side C :");
		int sideC = sc.nextInt();
		int peri = sideA + sideB + sideC;
		System.out.println("Perimeter is: " + peri);
		
	}
}



