package javaMatrix;

public class calculateFrequency {
	//Calculate The FreQuency Of Even And Odd Number in a Matrix
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [][] {{1,2,4},{3,5,4},{5,6,8}};
		int even =0, odd=0 ;
		int rows,cols;
		rows = a.length;
		cols = a[0].length;
		for(int i=0; i<rows ;i++) {
			for(int j=0 ;j<cols ; j++) {
				if(a[i][j]%2==0) {
					even++;
				}
				else {
					odd++;
				}
			}
		}
		System.out.println("Total Even Number In Given Matrix Are: "+ even);
		System.out.println("Total Odd Number In Given Matrix Are: "+ odd);
	}

}
