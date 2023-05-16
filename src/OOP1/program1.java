package OOP1;
class lamp{
	boolean isOn ;
	//Creating The Method For Turning On The Lamp
	void LampOn() {
		isOn = true ; 
		System.out.println("Light On? "+isOn);
	}
	//Creating The Method For Turning Off The Lamp
	void LampOff() {
		isOn = false ; 
		System.out.println("Light On? "+isOn);
	}
}
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating The Object Of The Class Lamp
		lamp obj = new lamp();
		obj.LampOn();
		obj.LampOff();
	}

}
