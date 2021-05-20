import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
       Dictionary geek = new Hashtable();
       geek.put("1","Cat");
       geek.put("2","Dog");
       geek.put("3","Fish");
    // get vals
       for (Enumeration i = geek.elements(); i.hasMoreElements();)
        {
            System.out.println("Value in Dictionary : " + i.nextElement());
        }
   // get keys
        for (Enumeration k = geek.keys(); k.hasMoreElements();)
        {
            System.out.println("Keys in Dictionary : " + k.nextElement());
        }
        // remove() method & size 
        System.out.println("\nRemove : " + geek.remove("1"));
        System.out.println("Check the value of removed key : " + 
        geek.get("1"));
  
        System.out.println("\nSize of Dictionary : " + geek.size());
	}
}

//O/P:
// Value in Dictionary : Fish
// Value in Dictionary : Dog
// Value in Dictionary : Cat
// Keys in Dictionary : 3
// Keys in Dictionary : 2
// Keys in Dictionary : 1

// Remove : Cat
// Check the value of removed key : null

// Size of Dictionary : 2


// https://ide.geeksforgeeks.org/TlhQIa0Wgz
