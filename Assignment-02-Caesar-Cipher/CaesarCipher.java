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
		
		
	
	
	}

}
