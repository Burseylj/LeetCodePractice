import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Hashtable;

public class PhoneNumberLetters {
	
	public static List<String> letterCombinations(String digits) {
		
        HashSet<String> combs = new HashSet<String>();
        combs.add("");
        if (digits == "") {return new ArrayList<String>(combs);}
        
        char[] cdigits = digits.toCharArray();
        for (char c : cdigits) {
        	char[] letters = getLetters(Character.getNumericValue(c));
        	HashSet<String> newCombs = new HashSet<String>();
        	for (char l : letters){
        		for (String comb: combs){
        			newCombs.add(comb+l);
        		}
        	}
        	combs = newCombs;
        }
        return new ArrayList<String>(combs);
    }
	
	private static char[] getLetters(int x){
		if (x< 2 || x > 9){
			return new char[0];
		}
		String[] nums = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return nums[x-2].toCharArray();
	}
}