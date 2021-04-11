import edu.duke.*;

public class WordPlay {
	
	public boolean isVowel(char ch) {
		
		String vowelUpper = "AEIOU";
		String vowelLower = "aeiou";
		
		if (vowelUpper.indexOf(ch) == -1 && vowelLower.indexOf(ch) == -1) {
		
		    return false;
		}
	
	    return true;
	
	}
	
	public void testWordPlay() {
		
		char ch1 = 'e';
		char ch2 = 'E';
		char ch3 = 'p';
		char ch4 = 'P';
		
		boolean result1 = isVowel(ch1);
		System.out.println(result1);
		
		boolean result2 = isVowel(ch2);
		System.out.println(result2);
		
		boolean result3 = isVowel(ch3);
		System.out.println(result3);
		
		boolean result4 = isVowel(ch4);
		System.out.println(result4);
	}
	
	
	
	
	
	public String replaceVowels(String phrase, char ch) {
		
		StringBuilder phraseRe = new StringBuilder(phrase);
		
		for(int i = 0; i < phraseRe.length(); i++) {
			
			char currChar = phraseRe.charAt(i);
			
			if(isVowel(currChar)) {
				
				phraseRe.setCharAt(i, ch);
			}	
		}
		
		return phraseRe.toString();
	}
	
	
	public void testreplaceVowels() {
		
		String result = replaceVowels("Hello World", '*');
		
		System.out.println(result);
			
	}
	
	
	
	
	
	public String emphasize (String phrase, char ch) {
		
		StringBuilder phraseRe = new StringBuilder(phrase);
		
	    for(int i = 0; i < phraseRe.length(); i++) {
			
			char currChar = phraseRe.charAt(i);
			
		    if(currChar == ch) {
				
			    if(i%2 == 0){
					
					// an odd number location
					phraseRe.setCharAt(i, '*');
			
			    } else {
					
					phraseRe.setCharAt(i, '+');				
					
				}
			
			}
			
			// Do nothing
	    }
		
		return phraseRe.toString();
	}
	
	public void testemphasize () {
			
		String result;
		
		result = emphasize("dna ctgaaactga", 'a');
		System.out.println(result);
		// expected result: "dn* ctg+*+ctg+"
			
		result = emphasize("Mary Bella Abracadabra", 'a');	
		System.out.println(result);	
		// expected result: "M+ry Bell+ +br*c*d*br+
	}
}
	