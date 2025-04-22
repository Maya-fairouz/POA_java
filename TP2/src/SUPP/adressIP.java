package SUPP;

import java.util.Scanner;
import java.util.StringTokenizer;

public class adressIP {
	
	
	
	 static boolean estNumerique(String x) {
		 try {
			Integer.parseInt(x);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	 }
	 
	 static String lireAdresse() throws AdressIPException {
		 Scanner sc = new Scanner(System.in);
		 String ip = sc.nextLine();
		 sc.close();
		 
		 int count =0 ; 
		 for (int i = 0; i < ip.length(); i++) {
			 if(ip.charAt(i) == '.') count++ ;
			 if(count>3) break;
	     }
		 if(count!=3) throw new AdressIPException(ip);
		 StringTokenizer st  = new StringTokenizer(ip , ".");
		 if(st.countTokens()!=4)
			 throw new AdressIPException(ip);
		 while(st.hasMoreTokens()) {
			 String x = st.nextToken();
			 if( !estNumerique(x))
				 throw new AdressIPException(ip);
			 if(Integer.parseInt(x)<0 || Integer.parseInt(x)>255 )
					throw new AdressIPException(ip);
		 } 
		 return ip;
	 }
	 
	 

	public static void main(String[] args) {
		try {
			System.out.println(lireAdresse() + "Est une adresse valide .");
		} catch (AdressIPException e) {
			System.err.println(e.getMessage());
		}
	} 

}
