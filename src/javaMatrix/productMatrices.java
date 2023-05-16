package javaMatrix;

public class productMatrices {
	//Write A Program To Find The Product Of The Two Matrices
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing The Two MAtrices a And b
		int a [][] = new int [][] {{1,2,3},{4,5,6},{7,7,9}};
		int b [][] = new int [][] {{6,2,7},{9,0,6}};
		int col1,row1,col2,row2;
		row1 = a.length;
		row2 = b.length;
		col1 = a[0].length;
		col2 = b[0].length;
		if(col1!=row2) {
			System.out.println("Multiplication Is Not Possible");
		}
		else {
		int product[][] = new int [row1][col2];
		for(int i=0 ;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				for( int k=0 ; k<row2;k++) {
					product[i][j]+=a[i][k]*b[k][j];					
				}
			}
		}
		//Printing The Matrix
		for(int i=0 ;i<row1 ;i++) {
			for(int j=0 ;j<col2 ;j++) {
				System.out.print(product[i][j]+" ");
			}
			System.out.println();
		}
		}
	}

}
