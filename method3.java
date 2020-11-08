public class method3 {
  public static void main(String args[]) {
	  String legalMessage = legalAge(19);
	  System.out.println(legalMessage);
	  
	  String legalMessage1 = legalAge(15);
		  System.out.println(legalMessage1);
  }
  
  public static String legalAge (int age) {
	   if (age >=18) {
		   return "This person is adult";
	   } else {
		   return"This person is underage";
	   }
	   
  }
  }
  

