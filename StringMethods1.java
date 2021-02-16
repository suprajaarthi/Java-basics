/*package whatever //do not write package name here */

import java.io.*;

public class str {
	public static void main (String[] args) {
		String a ="abcde";
// 		Find str len 
		System.out.println(a.length());
// 		Conv to upper & lower case 
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
// 		Index 
		System.out.println(a.indexOf("bc"));
		System.out.println(a.charAt(2));
//      replace char in  a string 
        System.out.println(a.replace("a","A"));
//      Str slicing 
        String str = "0123456789";
        System.out.println(str.substring(4));
        System.out.println(str.substring(4,7));

	}
}