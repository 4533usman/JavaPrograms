package javaMatrix;

public class sumRowCol {
	//Find The Sum Of Each Row And Column in A Matrix
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [][] {{1,1,1},{2,2,2},{3,3,3}};
		int rows , cols , sumRows , sumcols;
		rows = a.length;
		cols = a[0].length;
		//Finding The Sum OF The Rows
		for(int i=0 ; i<rows ; i++) {
			sumRows=0;
			for(int j=0 ; j<cols;j++) {
				sumRows+=a[i][j];
			}
			System.out.println("The Of Row "+ (i+1) +" is "+sumRows);
		}
		//Finding The Sum Of The Columns
		for(int i=0 ; i<cols ; i++) {
			sumcols=0;
			for(int j=0 ; j<rows ; j++) {
				sumcols+=a[j][i];
			}
			System.out.println("The Of Column "+ (i+1) +" is "+sumcols);
		}
	}

}
