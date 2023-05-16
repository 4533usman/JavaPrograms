package javaMatrix;

public class addMatrix {
	//Addition Of Two Matrices In Java 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = new int [][] {{9,8,7},{6,5,4},{3,2,1}};
		//Declaring a New Matrix Of Order 3 by 3 To Store The Result
		int r[][] = new int [3][3];
		//Now USing The Loops For adding The Above MAtrices
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				r[i][j]=0;
				for(int k=0 ; k<3;k++) {
					r[i][j] += a[i][k]*b[k][j] ;
				}
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}

}
