package javaMatrix;

public class sparseMatrix {
	//Check The Given Matrix Is Sparse Or Not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [][] {{1,2,0},{0,6,0},{0,0,8}};
		int rows ,cols, count =0 ;
		rows = a.length;
		cols = a[0].length;
		int size = rows*cols;
		for(int i=0 ; i<rows ; i++) {
			for (int j = 0 ; j<cols ; j++) {
				if(a[i][j]==0) {
					count++;
				}
			}
		}
		if(count>size/2) {
			System.out.println("Given Matrix Is A Sparse Matrix");
		}
		else {
			System.out.println("Given Matrix Is Not A Sparse Matrix");
		}
	}

}
