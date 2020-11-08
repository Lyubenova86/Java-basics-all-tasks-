import java.util.Scanner;
public class triangleTaskAngles {
public static void main(String[] args) {
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter value for angle1");
	int angle1 = sc1.nextInt();
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Enter value for angle2");
	int angle2 = sc2.nextInt();
	Scanner sc3 = new Scanner(System.in);
	System.out.println("Enter value for angle3");
	int angle3 = sc3.nextInt();
	
	int sum = angle1+angle2+angle3;
	if (sum !=180) {
		System.out.println("This triangle can't be built");
	}
	if(sum==180&&angle1<90&&angle2<90&&angle3<90) {
	System.out.println("This triangle is acute");
	}
	else if(sum==180&&angle1==90|angle2<90|angle3<90) {
		System.out.println("This triangle is right-angled");
	}
		else if(sum==180&&angle1>90|angle2<90|angle3<90) {
			System.out.println("This triangle is obtuse");
		}
		else if(sum==180&&angle1==60|angle2==60|angle3==60) {
			System.out.println("This triangle is equlateral");
		}
		else {
			System.out.println("This trinagle is multifaceted");
		}
		}
}

