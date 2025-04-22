package EXO4;

import java.util.HashMap;

public class IDandPassword {
	
	HashMap<String, String> loginInfo= new HashMap<String, String>();
	
     public IDandPassword() {
    	 loginInfo.put("maya","maya");
    	
     }
     
     protected HashMap<String, String> getLoginInfo(){
    	 return loginInfo;
    	 
     }
     
}

