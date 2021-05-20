import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        String a = "Hello World";
        int vow=0;
        for (int i=0;i<a.length() ;i++)
        {
            if("aeiouAEIOU".contains(String.valueOf(a.charAt(i))))
            {
                vow++;
            }
        }

        System.out.println(vow);
	}
}
# prog.java:10: error: incompatible types: char cannot be converted to CharSequence
#             if("aeiouAEIOU".contains(a.charAt(i)))
# on using this condn     ^


# https://ide.geeksforgeeks.org/YapEO0Ywce
