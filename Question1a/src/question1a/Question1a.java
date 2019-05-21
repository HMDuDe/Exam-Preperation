package question1a;

import javax.swing.JOptionPane;

public class Question1a {

	/* Q1.1) add a method called 'reverse' which receives a string as a 
	 * parameter and returns the reverse of that string*/
	public String reverse(String original) {
		String reversedString = "";
		
		for(int i = original.length() -1;i >= 0; i--) {

			reversedString = reversedString + original.charAt(i);
		}
		
		return reversedString;
	}
	
	public static void main(String[] args) {

		//Testing reverse method
		Question1a test = new Question1a();
		System.out.println(test.reverse("My mother told me"));
		
		/* Q1.2) Develop code in the main() method to input a word or a 
		 * sentence from the keyboard and determine whether or not it 
		 * is a palindrome. Print 'true' or 'false'*/
		String isPalindrome = JOptionPane.showInputDialog("Enter String to check for palindrome");
		System.out.println(isPalindrome.toLowerCase() + " " + test.reverse(isPalindrome).toLowerCase());
		
		if(isPalindrome.toLowerCase().equals(test.reverse(isPalindrome).toLowerCase())) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
