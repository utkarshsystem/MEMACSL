package training;

import java.util.Arrays;
import java.util.List;

public class SharadSplitArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "87, 5, 8, 9, 7, 4, 6, 3, 9, 0, 2";
		String[] splitArray = input.split("\\s*,\\s*");
		System.out.println(input);
		List<String> output = Arrays.asList(input.split("\\s*,\\s*"));
		System.out.println(output);
		System.out.println(output.get(0));
		System.out.println(splitArray[0]);
		System.out.println(Arrays.toString(splitArray));
			

	}

}
