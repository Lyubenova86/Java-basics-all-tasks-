import java.util.Scanner;
public class matrix2ddynamicRowsColumns {
   public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int rows = sc.nextInt();
	   int cols = sc.nextInt(); {
 
	   int counter = 1; 
	   int[][] digits = new int[rows][cols]; {
	   for (int i = 0; i < rows; i++) { 
		   for (int j = 0; j < cols; j++) {
		   digits[i][j] = counter; 
		   counter++; 
		   System.out.println(digits[i][j]);	
	}
   }
	   }
	   }
   }
}



