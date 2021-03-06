import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
 
class Main
{
    // Java Program to iterate List in reverse order
    public static void main (String[] args)
    {
        List<String> list = Arrays.asList("C", "C++", "Java");
 
        // use ListIterator to iterate List in reverse order
        ListIterator<String> itr = list.listIterator(list.size());
 
        // hasPrevious() returns true if the list has previous element
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}





//Reverse the following list using for loop list1 = [10, 20, 30, 40, 50]