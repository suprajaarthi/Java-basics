// https://ide.geeksforgeeks.org/0F0hzW62zX

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	   // int n=4;
        int a[] = { 1, 8, 3 };
        int b[]=new int[a.length];
        b=a;
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]+" ");
        }
	}
}
