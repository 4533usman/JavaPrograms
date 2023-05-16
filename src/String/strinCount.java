package String;

public class strinCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "My Name Is Usman Khalil";
		int count=0;
		for(int i=0 ; i<string.length();i++) {
			if(string.charAt(i) != ' ')  {
				count++ ; 
			}
		}
		System.out.print("Total Number Of Characters In The String Is: "+count);
	}

}
