import java.util.Scanner;
/*
 * John Le 
 * Assignment 2 question 11.9
 * program: creating a matrix n by n and printing the largest row index
 * and largest column index with most 1s
 * June 06 2022
 */
import java.util.ArrayList;
/*John Le
 * Filling a matrix of n x m with random numbers
 */
public class FillMatrix {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the array size n: ");
		int arraySize = input.nextInt();
		
		//populating 2d array with 1s and 0s
		int[][] matrix = new int[arraySize][arraySize];
		//fill 2d array
		fillMatrix(matrix);
		//printing out matrix
		printMatrix(matrix);
		
		ArrayList<Integer> row1 = FillMatrix.largeColumn(matrix);
		ArrayList<Integer> column1 = FillMatrix.largeColumn(matrix);
		System.out.println();
		
		System.out.println("The largest row index: " + row1);
		System.out.println("The largest column index: " + column1);
	}//end of main
	public static void fillMatrix(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * (1 - 0 + 1) - 0);
			}
		}
	}//end of fillMatrix	
	public static void printMatrix(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println();
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}		
		}
		System.out.println();
	}//end of printMatrix
	
	public static ArrayList<Integer> largeColumn(int[][] array){
		ArrayList<Integer> column = new ArrayList<Integer>();
		int ones;
		int maxCol = 0;
		for(int j = 0; j < array[0].length; j++) {
			ones = 0;
			for(int i = 0; i < array.length; i++) {
				if(array[i][j] == 1) {
					ones++;
				}
			}
			if(maxCol <= ones) {
				maxCol = ones;
				column.add(j);
			}
		}
		return column;
	}
	public static ArrayList<Integer> largeRow(int[][] array){
		ArrayList<Integer> row = new ArrayList<Integer>();
		int ones;
		int maxRow = 0;
		for(int i = 0; i < array.length; i++) {
			ones = 0;
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] == 1) {
					ones++;
				}
			}
			if(maxRow <= ones) {
				maxRow = ones;
				row.add(i);
			}
		}
		return row;
		
	}
	
}//end of class
