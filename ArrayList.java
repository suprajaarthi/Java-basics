import java.util.ArrayList;
import java.util.Collections;

public class Main { 
  public static void main(String[] args) { 
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    //Add numbers to array list
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    System.out.println("Set element to particular (index,element) ");
    myNumbers.set(0,12);
    
    // remove the elements in the index 
    int b=myNumbers.remove(1);
    System.out.println(" remove(index) "+b);

    int a=myNumbers.get(0);
    System.out.print(" get(index) "+"" +a);
    System.out.println("");
    
    
	for (int i : myNumbers) {
      System.out.println(i);
    }
     System.out.println(" sort using collections ");
    // import collections & sort the array 
    Collections.sort(myNumbers);

    for (int i : myNumbers) {
      System.out.println(i);
    }
    // Get length of the array
    System.out.println(myNumbers.size());


  } 
}
