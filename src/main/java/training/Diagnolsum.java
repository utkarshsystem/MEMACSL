package training;

import java.util.Arrays;
import java.util.List;

public class Diagnolsum {

	public static void main(String[] args) {
		String input="1,2,3,0,1,4,5,6,0";
		List<String> items = Arrays.asList(input.split("\\s*,\\s*"));
		int [][] matrix = Diagnolsum.make2DArray(items);
		int[][] newmatrix = Diagnolsum.copyFirstTwoColsToLast2Columns(matrix);
	}
	public static int[][] copyFirstTwoColsToLast2Columns(int [][] matrix ) {
		int [][] newmatrix = new int[3][5];
		
		for(int row=0;row<3; row++) {
			for(int col=0;col<3; col++) {
				newmatrix[row][col]=matrix[row][col];
				newmatrix[row][col]=matrix[row][col];
				if (col==0) {
					newmatrix[row][3] = matrix[row][col]; 
				} else if (col==1) {
					newmatrix[row][4] = matrix[row][col]; 					
				}
			}
		}
		return newmatrix;
	}
	public static int[][] make2DArray(List<String> items) {
		int [][] matrix = new int[3][3];
		int noOfElements=items.size();
		for (int i=0; i<noOfElements; i++) {
			int col=i%3;
			int row=i/3;
			System.out.println("rowno+ " + row+ "..colno..." + col);
			matrix[row][col]=Integer.parseInt(items.get(i));
		}
		return matrix;
	}
}
