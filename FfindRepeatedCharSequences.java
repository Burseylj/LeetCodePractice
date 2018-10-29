import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findRepeatedCharacterSequences {
	/*All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". 
	When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

	Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
	*/
	public static List<String> findRepeatedCharSequences(String s) {
        // create set to store all 10 character sequences, set to store all repeated sequences
        HashSet<String> sequences = new HashSet<String>();
        HashSet<String> repeats = new HashSet<String>();
        
        
        // we iterate through all the 10 character sequences
        for (int i = 0; i +9< s.length(); i++) {
            String seq = s.substring(i,i+10);
            
            if (sequences.contains(seq)){
                repeats.add(seq);
            } else { 
                sequences.add(seq);
            }
        }
        return new ArrayList<String>(repeats);
    }


	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		String s = "0123456789";
		s = s+s;
		strings.add(s);
		for (int i = 0;i<9;i++){
			s = s + Integer.toString(i);
			strings.add(s);
		}
		strings.add("");
		strings.add(s+s+s);
		strings.add("abcdefghijklmnopqrst");
		for (String testStr : strings){
			System.out.println("The string " + testStr + " has these repeating characters: " + findRepeatedCharSequences(testStr));
		}
	}

}