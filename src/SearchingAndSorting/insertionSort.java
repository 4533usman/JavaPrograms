package SearchingAndSorting;

public class insertionSort {
	//Defining And Declare The Function Insertion Sort
	public static void insertionSort(int arr[]) {
		for (int j = 1 ; j<arr.length ; j++) {
			int key = arr[j];
			int i = j-1 ;
			while(i>-1&&arr[i]>key) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key ;
		}
	}
	//Implementation Of The Insertion Sort Algorithm
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {12,3,23,5,2,1,6};
	System.out.println("Elements Before Sorting");
	//Printing The Array Elements 
	for(int i=0 ; i<arr.length ; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	//Now Calling The Insertion Sort Function
	insertionSort(arr);
	System.out.println("Elements After Sorting");
	for(int i=0 ; i<arr.length ; i++) {
		System.out.print(arr[i]+" ");
	}
	}

}
