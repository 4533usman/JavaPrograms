package String;

public class CountVowels {
	//Java Program TO Count The Vowels And Consonants In The String
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name Is Usman Khalil";
		str=str.toLowerCase();
		int countVowels=0,countConsonants=0 ;
		for(int i=0 ; i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'
					||str.charAt(i)=='u') {
				countVowels++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
				countConsonants++;
			}
		}
		System.out.println("Total Numbers Vowels In The String Are: "+countVowels);
		System.out.print("Total Number Consonants In The String Are: "+ countConsonants);
	}

}
