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
}
	