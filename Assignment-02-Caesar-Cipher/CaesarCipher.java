import edu.duke.*;

public class CaesarCipher {
	
    public String encrypt(String input, int key) {
		
		StringBuilder encrypted = new StringBuilder(input);
		
		String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
		
		String shiftedAlphabetUpper = alphabetUpper.substring(key)+alphabetUpper.substring(0,key);
		String shiftedAlphabetLower = alphabetLower.substring(key)+alphabetLower.substring(0,key);
		
	    //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
			
			if(Character.isUpperCase(currChar)) {
			    //Find the index of currChar in the alphabet (call it idx)
                int idx = alphabetUpper.indexOf(currChar);
                //If currChar is in the alphabet
                if(idx != -1){
                    //Get the idxth character of shiftedAlphabet (newChar)
                    char newChar = shiftedAlphabetUpper.charAt(idx);
                    //Replace the ith character of encrypted with newChar
                    encrypted.setCharAt(i, newChar);
				}
                //Otherwise: do nothing 		    
			} else if(Character.isLowerCase(currChar)) {
			    //Find the index of currChar in the alphabet (call it idx)
                int idx = alphabetLower.indexOf(currChar);
                //If currChar is in the alphabet
                if(idx != -1){
                    //Get the idxth character of shiftedAlphabet (newChar)
                    char newChar = shiftedAlphabetLower.charAt(idx);
                    //Replace the ith character of encrypted with newChar
                    encrypted.setCharAt(i, newChar);
				}
                //Otherwise: do nothing 		    			
			} else {
				
			}
			
		}
		
        //Your answer is the String inside of encrypted
        return encrypted.toString();
	}
	
	public void testCaesar() {
        int key = 17;
        
		FileResource fr = new FileResource();
	    String message = fr.asString();
		
		String encrypted = encrypt(message, key);
        System.out.println(encrypted);
		// expected result : "CFOPQ IBDFLK XQQXZH BXPQ CIXKH!"
		
		String decrypted = encrypt(encrypted, 26-key);
        System.out.println(decrypted);
	}
	
	
	
	
	public String encryptTwoKeys(String input, int key1, int key2) {
		
		StringBuilder encrypted = new StringBuilder(input);
		
		String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
		
		String shiftedAlphabetUpperKey01 = alphabetUpper.substring(key1)+alphabetUpper.substring(0,key1);
		String shiftedAlphabetLowerKey01 = alphabetLower.substring(key1)+alphabetLower.substring(0,key1);
		
		String shiftedAlphabetUpperKey02 = alphabetUpper.substring(key2)+alphabetUpper.substring(0,key2);
		String shiftedAlphabetLowerKey02 = alphabetLower.substring(key2)+alphabetLower.substring(0,key2);
		
		char newChar;
		
		for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
			
						
			char currChar = encrypted.charAt(i);
						
			if (i%2 == 0) {
				
				if(Character.isUpperCase(currChar)) {
				
				    int idx = alphabetUpper.indexOf(currChar);
					
					if(idx != -1){
					    newChar = shiftedAlphabetUpperKey01.charAt(idx);
						encrypted.setCharAt(i, newChar);
					}
					
				} else if(Character.isLowerCase(currChar)) {
				
				    int idx = alphabetLower.indexOf(currChar);
					
					if(idx != -1){
					    newChar = shiftedAlphabetLowerKey01.charAt(idx);
						encrypted.setCharAt(i, newChar);
					}
				
				} else {
				    // Do nothing
				}
				
			} else {
			
			    if(Character.isUpperCase(currChar)) {
				
				    int idx = alphabetUpper.indexOf(currChar);
					
					if(idx != -1){
					    newChar = shiftedAlphabetUpperKey02.charAt(idx);
						encrypted.setCharAt(i, newChar);
					}
					
				} else if(Character.isLowerCase(currChar)) {
				
				    int idx = alphabetLower.indexOf(currChar);
					
					if(idx != -1){
					    newChar = shiftedAlphabetLowerKey02.charAt(idx);
						encrypted.setCharAt(i, newChar);
					}
				
				} else {
				    // Do nothing
				}
			  
			}
						
		}
		
		//Your answer is the String inside of encrypted
        return encrypted.toString();
			
	}
	
	public void testEncryptTwoKeys() {
        int key01 = 23;
		int key02 = 17;
        
		FileResource fr = new FileResource();
	    String message = fr.asString();
		
		String encrypted = encryptTwoKeys(message, key01, key02);
        System.out.println(encrypted);
		// expected result : "CFOPQ IBDFLK XQQXZH BXPQ CIXKH!"
		
		String decrypted = encryptTwoKeys(encrypted, 26-key01, 26-key02);
        System.out.println(decrypted);
	}
	
}
