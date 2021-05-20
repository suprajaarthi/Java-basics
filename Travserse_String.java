// Uppercase only even positions in string 
import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        String a = "Hello World";
        String[] arr = a.split(" ");
        for (String x:arr)
        {
            int i=0;
            for(Character ch : x.toCharArray())
            {   
                i+=1;
                if(i%2==0)
                {
                    System.out.print(Character.toUpperCase(ch));
                    
                }
            }
        }        
	}
}


// https://ide.geeksforgeeks.org/dZtuNf9V6w
