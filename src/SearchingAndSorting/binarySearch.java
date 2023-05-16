package SearchingAndSorting;

public class binarySearch {
	//Define The Function Using Recursion
	public static int binarySearch(int arr[],int first,int last,int key) {
		
		if(last>=first) {
			int mid = first + (last - first)/2 ;
			if(arr[mid]==key) {
				return mid ;
			}
			else if(arr[mid]>key) {
				return binarySearch(arr,first,mid-1,key) ;
			}
			else {
				return binarySearch(arr,mid+1,last,key);
			}
		}
		
		return -1;
	}
	//Implementation Of The Binary Search 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {1,23,43,54,123,452};
	int last = arr.length-1;
	int key =5;
	//Calling The Function BinarySearch
	int result = binarySearch(arr,0,last,key);
	if(result == -1) {
		System.out.print(key+" Is Not Found In The Array");
	}
	else {
		System.out.print(key+" Found In The Array");
	}
	}

}
