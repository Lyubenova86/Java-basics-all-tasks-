public class largestNumberinArray { 
     static int number[] = {10, 234, 5678, 10897}; 
       
     static int largest() 
     { 
         int i; 
         int max = number[0];  
         for (i = 1; i < number.length; i++) 
             if (number[i] > max) 
                 max = number[i];  
         return max; 
     } 
            public static void main(String[] args)  
     { 
         System.out.println("The largest number in this array is " + largest() + "."); 
        } 
 } 