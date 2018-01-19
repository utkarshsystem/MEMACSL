package training;

import java.util.Stack;

public class Valuecode {

	public static void main(String[] args) {
		char[] input = {'2','3', '*'};
		int num1 = 0;
		int num2 = 0;
		Stack<Integer> calculator = new Stack<Integer>();
		 for (int i = 0; i < input.length; i++) {
			 System.out.println(" input " + input[i]);
			if(input[i]!='*' && input[i]!='/' && input[i]!= '+' && input[i]!= '-') {
				calculator.push(Character.getNumericValue(input[i]));			
				}
			else {
				num1 = (int) calculator.pop();
				num2 = (int) calculator.pop();
				if(input[i] == '*') {
					System.out.println(num1*num2);
				}
			}
			
;		}
		 
	}

}
