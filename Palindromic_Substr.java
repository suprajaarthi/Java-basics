//  https://ide.geeksforgeeks.org/puuzjrpS85

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        String a = "abcacdef";
        
        for (int i=0;i<a.length();i++)
        {
            for(int j=i+1;j<a.length();j++)
            {
                String sub=a.substring(i,j+1);
                StringBuilder sb = new StringBuilder();
                sb.append(sub);
                sb.reverse();
                String com=sb.toString();
                if(com.equals(sub))
                {
                    System.out.println(sub);
                }
            }
        }
	}
}

//  O/p :
// cac
