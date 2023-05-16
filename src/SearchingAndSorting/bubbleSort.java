package SearchingAndSorting;

public class bubbleSort {
	//Defining The Function BubbleSort
	public static void bubbleSort (int arr[]) {
		int temp=0;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j = 1 ; j<arr.length-i ; j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp ;
				}
			}
		}
	}
	//Implementation Of The Bubble Sort Algorithm
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {23,45,21,19,8,6,100};
	System.out.println("Array Before Sorting");
	//Printing The Elements Of The Array
	for(int i=0 ; i<arr.length ; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Array After Sorting");
	//Calling The Function BubbleSort
	bubbleSort(arr);
	//Print The Elements Of The Array After Sorting
	for(int i = 0 ; i<arr.length ; i++) {
		System.out.print(arr[i]+" ");
	}
	}

}
