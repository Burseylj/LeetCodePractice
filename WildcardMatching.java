public static boolean isMatch(String s, String p) {
		//handle base case where s is empty
        if (s.length()==0) {
        	// if s is empty, p must either be empty or a series of * wildcards
        	if (p.length() == 0 || (p.charAt(0) == '*'&& isMatch("",p.substring(1)) )) {
        		return true;
        	} else {
        		return false;
        	}
        }
        // handle base case where p is empty
        if (p.length() == 0 && s.length() != 0) {
        	return false;
        }
        char sHead = s.charAt(0);
        char pHead = p.charAt(0);
        //if first char of each string is equal or if we have the single character wildcard, check the rest of the string
        if (sHead == pHead || pHead == '?') {
        	return isMatch(s.substring(1), p.substring(1));
        }
        //if we have the multi character wildcard, check if s matches the rest of p, or if skipping the head of s gives us a match
        if (pHead == '*'){
        	//prevent extensive calls for repeating wildcards
        	if (p.length() > 1 && p.charAt(1) == '*') {
        		return isMatch(s, p.substring(1));
        	}
        	return isMatch(s, p.substring(1)) || isMatch(s.substring(1),p);
        }
        //if the first char doesn't match and isn't a wildcard, return false
        return false;
    }


	public static void main(String[] args) {
		String[] firstStrings = {"true", "false", "", "", "", "falsefalsefalsex", "truex", "true", 
				"aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", 
				"babbbbaabababaabbababaababaabbaabababbaaababbababaaaaaabbabaaaabababbabbababbbaaaababbbabbbbbbbbbbaabbb"
				
				};
		String[] matchStrings = {"tru?", "flase", "", "*", "?", "f*z", "t*", "true**", 
				"a*******b", 
				"b**bb**a**bba*b**a*bbb**aba***babbb*aa****aabb*bbb***a"
				};
		for (int i = 0; i <firstStrings.length; i++) {
			System.out.println("\"" + firstStrings[i] + "\" == \"" + matchStrings[i] + "\" is " + isMatch(firstStrings[i], matchStrings[i]));
		}
		System.out.println();
		for (String s : firstStrings){
			System.out.println("\"" + s + "\" matches \"*\" is " + isMatch(s, "*"));
		}
	}
}