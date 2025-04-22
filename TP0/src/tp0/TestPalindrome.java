package tp0;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestPalindrome {
	public static String compresser(String s) {
		String str ="";
		
	     char[] tab = s.toCharArray();
	     for (int i=0; i< s.length(); i++) {
				if( s.charAt(i)!= ' ' && s.charAt(i)!=',' && s.charAt(i)!='.'&& s.charAt(i)!=';' && s.charAt(i)!='\'')
					str=s.charAt(i)+str;
				
	     }
	     System.out.println(tab);
	     return str;
	}  
		
	

	
	}






	


