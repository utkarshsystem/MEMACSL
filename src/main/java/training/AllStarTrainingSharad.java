package training;

import java.util.Arrays;

public class AllStarTrainingSharad {

	public static void main(String[] args) {
		String str =  "5, 0, 1, 0, 1, 0, R1, A0, A0, X1, X1, R1, A0, R0, X0, A1";
		String str2 =  "5, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1";
		int count = 1,postion=0;
		String [] values = str.split(",");
		String [] values2 = str2.split(",");
		displayValues(count, values);
		System.out.println();
		int numberofelements = Integer.parseInt(values[0]);
		for (int i = 1; i <= numberofelements;) {
			if (count<=numberofelements) {
				postion=0;
			} else {
				postion=1;
			}
			for (int j = 0; j < numberofelements-1; j++) {
				String firstpair = values[count].trim();
				String secondpair = values[count+1].trim();
				char firstpairchar = firstpair.charAt(postion);
				char secondpairchar = secondpair.charAt(postion);
				System.out.print(firstpairchar + "." + secondpairchar + "...");
				count++;
			}
			count++;
			numberofelements--;
			System.out.println();
		}
	//	displayNumbers(count, values);
		
		
//		for (int i = 0; i <= numberofelements; i++) {
//			for (int j = 0; j < numberofelements; j++) {
//				for (int h = 0; h < numberofelements; h++) {
//					for (int k = 0; k < numberofelements; k++) {
//						System.out.print(values[count++]);	
//					}
//					numberofelements--;
//					System.out.println();
//
//				}
//				/*
//				 * Input 5, 0, 1, 0, 1, 0, R1, A0, A0, X1, X1, R1, A0, R0, X0, A1
//				 * Output 
//				 * 01010
//				 * 1001
//				 * 110
//				 * 00
//				 * 1
//				 * 
//				 * Hyphion each pair
//				 * Input: 01010
//				 * Output: 01-10-01-10
//				 * 1001 = 10-00-01
//				 * 110 = 11-10
//				 * 00 = 00	 
//				 * 1 = 1
//				 */
//			}
//
//		}
	}

	private static void displayValues(int count, String[] values) {
		int numberofelements = Integer.parseInt(values[0]);
		for (int i = 1; i <= numberofelements;) {
			//System.out.println(numberofelements);
			for (int j = 0; j < numberofelements; j++) {
				System.out.print(values[count++]);
			}
			numberofelements--;
			System.out.println();
		}
	}
	
	private static void displayNumbers(int count, String[] values) {
		
	}
}