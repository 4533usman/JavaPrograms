package SearchingAndSorting;

public class selectionSort {
	public static void selectionSort(int arr[]) {
		for(int i = 0 ; i<arr.length ; i++ ) {
			int index = i ;
			for(int j = i+1 ; j<arr.length ; j++) {
				if(arr[j]<arr[index]) {
					index = j;
				}
				
			}
			int smallest = arr[index];
			arr[index] = arr[i];
			arr[i] = smallest ;
		}
	}
	//Implementation Of The Selection Sort
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {12,4,32,54,1,5,2,43};
	System.out.print("Before Sorting The Arrays Is: ");
	for(int i = 0 ; i<arr.length ; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	selectionSort(arr);
	System.out.print("After Sorting The Array Is: ");
	//Printing The Array Elements After Sortings
	for(int i=0 ; i<arr.length ; i++) {
		System.out.print(arr[i]+" ");
	}
	}

}
