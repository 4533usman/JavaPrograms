package SearchingAndSorting;
import java.util.*;

public class linearSreach {
	public static boolean search(int[]arr,int x) {
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]==x) {
				return true; 
			}
			
		}
		return false;
	}
	//Implementation Of The Linear Search 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {12,34,54,23,12,53,76,87,54};
		System.out.println("Enter Any Number To Search: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		//Calling the Function 
		if(search(arr,x)) {
			System.out.print("Number is Found In Given Array");
		}
		else {
			System.out.print("Number Is Not Found In The Array");
		}
	}

}
