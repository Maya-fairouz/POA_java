package poa0;
import java.util.Scanner;
public class TestPalindrome {
   
	public static String compresser(String s) {
		String str ="";
		for (int i=0; i< s.length(); i++) {
			if( s.charAt(i)!= ' '&& s.charAt(i)!=','&& s.charAt(i)!='.'&& s.charAt(i)!=';' && s.charAt(i)!='\'')
				str+= s.charAt(i);
			
		}
		
		
		return str;
		
	} // tochararray trje3 char to an array

	public static String inverse(String s ) {
		
		String str="";
		 for (int i = 0; i < s.length(); i++)
			 if(s.charAt(i)!=' '&& s.charAt(i)!=','&& s.charAt(i)!='.'&& s.charAt(i)!= '\''){
				 str+=s.charAt(i)+str;
			 }
			 return str;
	}
	static boolean estPalindrome(String s) { 
        String m1 = compresser(s);
        String m2 = inverse(m1);
        if(m1.equalsIgnoreCase(m2))
     	   
     	   return true;
        else
     	   return false;
	}
	



	public static void main(String[]args ) {
		System.out.println("enter an expression :");
		 Scanner  sc = new Scanner(System.in);
		
	
}
}




