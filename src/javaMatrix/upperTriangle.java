package javaMatrix;

public class upperTriangle {
	//Convert A Matrix Into UpperTriangular Matrix
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		int rows,cols;
		rows = a.length;
		cols = a[0].length;
		for(int i=0 ; i<rows; i++) {
			for(int j =0 ;j<cols;j++) {
				if(j>i) {
					System.out.print("0 ");
				}
				else {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
