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


# https://ide.geeksforgeeks.org/YapEO0Ywce
