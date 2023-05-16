package javaMatrix;

public class checkIdentity {
	//To Check Given Matrix Is Identity Or Not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [][] {{1,7,0},{0,1,0},{0,0,1}};
		int rows , cols ;
		boolean flag = true ;
		rows = a.length;
		cols = a[0].length;
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ;j++) {
				if(i==j&&a[i][j]!=1) {
					flag = false ;
				}
				if(i!=j&&a[i][j]!=0) {
					flag = false ;
				}
			}
		}
		if(flag) {
			System.out.println("Given Matrix Is An Identity Matrix");
		}
		else {
			System.out.println("Given Matrix Is Not An Identity Mattix");
		}
	}

}
