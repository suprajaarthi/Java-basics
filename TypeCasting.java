import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
      int n = 54;
    //   Int  => String 
      String num = Integer.toString(n);
      char[] ch=num.toCharArray();
//     Checking if it's a str by converting the str to chararray and accessing the 0th element 
      System.out.println(ch[0]);
      System.out.println(num);
    //  String => Int , multiply string by 2 
      int g = Integer.parseInt(num);
      System.out.println(g*2);
	}
}

// https://ide.geeksforgeeks.org/NbhB2twCUc
