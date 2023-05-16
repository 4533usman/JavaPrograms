package javaMatrix;

public class equalMatrices {
	//Write A Program To Check That Given Matrices are Equals Or Not 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = new int [][] {{1,2,8},{4,5,6},{7,8,9}};
		int row1,row2,col1,col2;
		boolean flag = true ;
		row1 = a.length;
		row2 = b.length;
		col1 = a[0].length;
		col2 = b[0].length;
		if(row1!=row2||col1!=col2) {
			System.out.print("Given Matrices Are Not Equals");
		}
		else {
			for(int i=0 ; i<row1 ; i++) {
				for(int j=0 ; j<col1 ; j++) {
					if(a[i][j]!=b[i][j]) {
						flag = false;
						break;
					}
				}
			}
			if(flag) {
				System.out.print("Given Matrices Are Equals");
			}
			else {
				System.out.print("Given Matrices Are Not Equals");
			}
		}
	}

}
