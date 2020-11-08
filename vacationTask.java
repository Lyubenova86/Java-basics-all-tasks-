import java.util.Scanner;

public class vacationTask {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vacation type - Beach or Mountain: ");
		String type = sc.nextLine();
		System.out.println("Enter budget for your vacation: ");
		double budget = sc.nextDouble();
		
		if (type.equals("Beach") && budget < 50) {
			System.out.println("Bulgaria is a perfecgt place for your beach vacation");
		}
		else if (type.equals("Beach") && budget >= 50) {
		System.out.println("You can choose destination outside of BG for your beach vacation");
		}
		else if (type.equals("Mountain") && budget < 30) {
			System.out.println("Bulgaria is perfect place for your mountain vacation");
		}
		else if (type.equals("Mountain") && budget >= 30) {
			System.out.println("You can choose destination outside of BG for your mountain vacation");	
			}
		else {
			System.out.println("No information for this type of vacation");
		}
			}
	}