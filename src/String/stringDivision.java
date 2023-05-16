package String;

public class stringDivision {
	//Divide The String Into The Three Sub Strings
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "aaaabbbbcccc" ;
		int temp=0, n=3, len = str.length();
		int chars  = len/n;
		String[] equalStr = new String[n];
		for(int i=0 ; i<len ; i=i+chars) {
			String part =  str.substring(i,i+chars);
			equalStr[temp] = part ;
			temp++;
		}
		//Now We Are Going To Print The EqualStr Array 
		for (int i=0 ; i<equalStr.length ; i++) {
			System.out.println("String At Index "+(i)+" is "+equalStr[i]);
		}
	}

}
