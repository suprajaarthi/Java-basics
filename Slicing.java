// Generate all possible substrings 

// https://ide.geeksforgeeks.org/TMSnGCdzr1

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        String a = "abcdef";
        for (int i=0;i<a.length();i++)
        {
            for(int j=i+1;j<a.length();j++)
            {
                String sub=a.substring(i,j+1);
                System.out.println(sub);
            }
        }
	}
}
// O/P
// ab
// abc
// abcd
// abcde
// abcdef
// bc
// bcd
// bcde
// bcdef
// cd
// cde
// cdef
// de
// def
// ef


