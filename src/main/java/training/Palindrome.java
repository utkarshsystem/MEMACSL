package training;

import java.util.Scanner;

public class Palindrome {
	/*
	 * 
	 */
	public static void main(String[] args) {
		String name="1234567";
		String firstchar = "" ;
		String secondchar = "";
		isPalindrome(name);
	}

	/*
	 * Input 123456
	 * 
	 * Output
	 * 1 6
	 * 2 5
	 * 4 3
	 */
	private static void isPalindrome(String name) {
		String firstchar;
		String secondchar;

		int wordlength = name.length();
		System.out.println(wordlength);
		for (int i = 0, len=wordlength; i<len; i++, len--) {
			firstchar =name.substring(i, i+1);
			secondchar = name.substring(len-1,len);
			System.out.println(".." + firstchar + ".." + secondchar);
		}
	}
}
