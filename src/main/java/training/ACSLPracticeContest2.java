package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * (2+3*6+1
2–5*(6+1
5+5–2)*5
3*5+(8/4*2
2+8/4*5)
6+2/3*4)
(2–2+2+3*4/2
8/(2+3–6+2
7–5+8*6/2)+1
9+6)/2–4+5
 */
public class ACSLPracticeContest2 {
	ArrayList<String> inputData= new ArrayList<String>();
	ACSLPracticeContest2() {
		inputData.add("(2+3*6+1");
		inputData.add("2–5*(6+1");
		inputData.add("5+5–2)*5");
		inputData.add("3*5+(8/4*2");
		inputData.add("2+8/4*5)");
	}
	public static void main(String[] args) {
		List result = new ArrayList<Integer>();
		Stack<Integer> values = new Stack<Integer>();
		String input = "(2+3*6+1";
		int roundBracketStart=0;
		int roundBracketEnd=0;
		roundBracketStart = input.indexOf('(');
		roundBracketEnd =  input.indexOf(')');
		System.out.println("roundBracketStart..." + roundBracketStart);
		System.out.println("roundBracketEnd..." + roundBracketEnd);
		
		for (int i = roundBracketStart +1; i < input.length(); i++) {
			char isNumOrOp = input.charAt(i);
			System.out.print(i + ".." + isNumOrOp);
			System.out.println();
			result.add(i);
		}
		System.out.println(result);
		
	}
}
