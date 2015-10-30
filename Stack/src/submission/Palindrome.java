package submission;
import java.util.Stack;

public class Palindrome {
	public static boolean isPalindrome(String s) {
		// I had to look up how to do most of this on google. 
		// TODO use a stack to determine if s is palindrome
		//Put the elemets of the string into a stack. Make a new stack and reverse that, if they
		//are the same then return true. 
		
		//make a new stack
		Stack<Character> stack = new Stack<Character>();
		//made strings to lowercase
		s = s.toLowerCase();
		//Loop to push characters into the stack
		for (int i = 0; i < s.length(); i++){
			stack.push(s.charAt(i));
		}
		//blank string
		String reverse = "";
		
		//adds the popped characters into the string
		while (! stack.isEmpty()){
			reverse+=stack.pop();
		}
		//if the reverse string equals the original string true/false
		if (reverse.equals(s))
			return true;
			
		else
			return false;
			
	}
//I made another one where I only had to look up the stringbuffer reverse thing. 	
	public static boolean isPalindrome2(String s){
		s = s.toLowerCase();
		String word = s;
		String word2 = new StringBuffer(word).reverse().toString();
		
		if (word.equals(word2))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
				System.out.println(isPalindrome("Otto"));
				System.out.println(isPalindrome("bob"));
				System.out.println(isPalindrome("peanut"));
				System.out.println(("-------------"));
				System.out.println(isPalindrome2("Otto"));
				System.out.println(isPalindrome2("bob"));
				System.out.println(isPalindrome2("peanut"));
				
	}
}
