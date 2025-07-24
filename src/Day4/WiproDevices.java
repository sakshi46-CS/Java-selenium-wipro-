package Day4;

 abstract class wiprosystem{
	abstract void devicetype();
	abstract void Ram();
	
}
class Desktop extends wiprosystem{
	void devicetype() {
		System.out.println("Device type is Desktop");
	}
	void Ram() {
		System.out.println("Ram is 256GB");
	}
}
class laptop extends wiprosystem{
	void devicetype() {
		System.out.println("Device type is laptop");
		
	}
	void Ram() {
		System.out.println("Ram is 128GB");	
	}
}
public class WiproDevices {
 public static void main(String[] args) {
   wiprosystem ws=new Desktop();
   ws.devicetype();
   ws.Ram();
   
   wiprosystem ws1=new laptop();
   ws1.devicetype();
   ws.Ram();
   
   
 }
}
