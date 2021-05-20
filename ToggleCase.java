// https://ide.geeksforgeeks.org/phlilQDcDl

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	  String a ="Apple_World";
	  String togg="";
	  for (int i=0;i<a.length();i++)
	  {
	      char ch = a .charAt(i);
	      if(Character.isUpperCase(ch))
	      {
	          ch = Character.toLowerCase(ch);
	          togg=togg+ch;
	      }
	      else if(Character.isLowerCase(ch))
	      {
	           ch = Character.toUpperCase(ch);
	           togg=togg+ch;
	      }
	  }
	  System.out.println(togg);
	}
}

// O/P:aPPLEwORLD
