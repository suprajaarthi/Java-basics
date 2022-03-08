/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {

        Scanner sc= new Scanner(System.in);
        String n = sc.nextLine();
        for (int i=0; i<n.length();i++) 
        {
            if(i%2!=0)
            {
                System.out.println(n.charAt(i));
            }
        }
        
        
	}
}
