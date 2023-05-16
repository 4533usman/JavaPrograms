package OOP1;
//Implementation Of The Methods Both Static And Without Static Method
class A{
	//Method OverLoading
	public int sum (int a ,int b , int c) {
		int sum = a+b+c;
		return sum;
	}
	public  int sum (int a , int b) {
		int sum = a+b ;
		return sum ;
	}
}
public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating The Object Of The Class
		A obj = new A();
		System.out.println("Sum Of The Two Numbers Is: "+obj.sum( 20 ,  100));
		System.out.println("Sum Of The Two Numbers Is: "+obj.sum( 20 ,  100, 200));
	}

}
