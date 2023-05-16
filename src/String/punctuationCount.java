package String;

public class punctuationCount {
	//Counting The Total Number Of Punctuation In The String
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name Is USman Khalil, And My Father's Name Is Muhammad Shafiq-Ur-Rehman";
		int count=0;
		for(int i=0 ; i<str.length();i++) {
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
					str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':'){
				count++;
			}
		}
		System.out.print("Total Number Of Punctuations In The String Is: " +count);
	}

}
