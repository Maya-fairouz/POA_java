package SUPP;

import java.util.Scanner;

public class AdressIPException extends Exception{
   
	String ip;
	
	public AdressIPException(String ip) {
		this.ip = ip ;
	}
	    @Override
	    public String getMessage() {
	    	return ip +" Adresse n'est pas valide";
	    }
	 
}
	

