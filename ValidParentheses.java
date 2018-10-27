import java.util.Stack;

public class ValidParentheses {
	
	/* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

	An input string is valid if:

	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Note that an empty string is also considered valid. */
	
	public static boolean isValid(String s){
		char[] sArr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char c : sArr) {
			if (isLeft(c)) {
				stack.push(c);
			} else {
				if ( stack.empty() || stack.pop()!= opposite(c)){
					return false;
				}
			}
		}
		return stack.empty();
	}
	private static boolean isLeft(char c){
		return (c == '[' ||c == '{' || c == '(');
	}
	private static char opposite(char c) {
		switch (c){
			case '{' : return '}';
			case '}' : return '{';
			case '[' : return ']';
			case ']' : return '[';
			case '(' : return ')';
			case ')' : return '(';
		}
		return '-';
	}

	public static void main(String[] args) {
		String[] testCases = {"{}[]()", "{{{","}}}" ,"{([])}", "{[(}])"};
		for (String x : testCases) {
			System.out.println("The string " + x + " is valid: " + isValid(x));
		}
	}

}