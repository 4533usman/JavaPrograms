package javaMatrix;

public class subMatrices {
	//Subtraction Of Two Matrices
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		int r[][] = new int [3][3];
		//Using Of The For Loop For Iterating Through The Array and Subtract
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				r[i][j]=a[i][j]-b[i][j];
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}

}
