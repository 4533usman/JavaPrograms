package String;

public class stringSubset {
	//Find The SubSet Of The String 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "USMAN";
		int len = str.length();
		int temp=0;
		String[] strArray = new String[ len*(len + 1)/2];
		//Using The For Loops For Making The Combinations Of String
		for(int i=0 ; i<len ; i++) {
			for(int j=i ; j<len ; j++) {
				strArray[temp] = str.substring(i, j+1);
				temp++;
			}
		}
		//Now We Are Going To Printing The String Array 
		for(int i=0 ; i<strArray.length ; i++) {
			System.out.println(strArray[i]);
		}
	}

}
