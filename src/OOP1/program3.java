package OOP1;
class B{
	int age ;
	B(int age){
		 this.age = age ;
	}
	void show() {
		System.out.println("Your Current Age Is: "+this.age);
	}
}
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating The Object Of The Class A
		B obj = new B(30);
		obj.show();

	}

}
