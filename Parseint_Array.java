import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 		String a =sc.nextLine();
// 		String b =sc.nextLine();
        String a="1 3 44 2";
        String b="6 7 88 90";
		String[] arr = a.split(" ");
		String[] brr = b.split(" ");
		for (int i=0;i<arr.length ;i++ )
		{
		    int x = Integer.parseInt(arr[i]);
		    System.out.println(x);
		}
			}
}


// https://ide.geeksforgeeks.org/spboFytJvF
