package String;

import java.util.Arrays;

public class compareString {
	//Compare Two String 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Usman" ; 
		String str2 = "namaU" ;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		boolean flag = true;
		if(str1.length()!=str2.length()) {
			System.out.print("String Are Not Equals");
		}
		else {
			char [] str11 = str1.toCharArray();
			char [] str22 = str1.toCharArray();
			Arrays.sort(str11);
			Arrays.sort(str22);
			for(int i=0 ;i<str1.length();i++) {
				if(str11[i]!=str22[i]) {
					flag = false ; 
					break ;
				}
			}
			if(flag) {
				System.out.print("Strings Are Equals");
			}
			else {
				System.out.print("String Are Not Equals");
			}
		}
	}

}
