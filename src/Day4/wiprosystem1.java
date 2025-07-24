package Day4;

  interface wiprosystem1 {
	void devicetype();
	void Ram();
 }
 class Desktop1 implements wiprosystem1{
	public void devicetype() {
		 System.out.println("Devicetype is Desktop1");
	 }

	@Override
	public void Ram() {
		 System.out.println("Ram is 256GB");
		
	}
	

}
 class laptop1 implements wiprosystem1{

	@Override
	public void devicetype() {
		System.out.println("Devicetype is laptop1");
		
	}

	@Override
	public void Ram() {
	System.out.println("Ram is 128GB");
		
	}
	 
 public class wiprodevices1{
	 public static void main(String[] args) {
		   wiprosystem ws=new Desktop();
		   ws.devicetype();
		   ws.Ram();
		   
		   wiprosystem ws1=new laptop();
		   ws1.devicetype();
		   ws.Ram();
 }
}
 }