// https://ide.geeksforgeeks.org/ZX7KpWTegZ
import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
       int n=12;
       String binary=Integer.toBinaryString(n);
       
       System.out.println(binary);
       int count=0;
       for (int i=0;i<binary.length();i++)
       {
           char c = binary.charAt(i);
           if(c=='1')
           {
               count+=1;
           }
       }
       System.out.println(count);
        
	}
}
// OP
// 1100
// 2
