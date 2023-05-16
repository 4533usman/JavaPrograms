package javaMatrix;

public class transposeMatrix {
	//Java Program To Find The Transpose Of Given MAtrix
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		int rows , cols ;
		rows = a.length;
		cols = a[0].length;
		int transpose[][] = new int [cols][rows];
		//Now We are USing The For Loop For Iterating Through The Matrix and Replacing The Rows With Columns
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				transpose[i][j] = a[j][i];
			}
		}
		//Printing The Matrix 
		for(int i=0 ; i<cols ; i++) {
			for(int j=0 ; j<rows ; j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}

}
