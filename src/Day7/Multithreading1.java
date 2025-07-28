package Day7;
class Mul1 extends Thread{
	public void run(){
		for(int i=0;i<=10;i++) {
			System.out.println("Java selenium batch");	
			try {
				Thread.sleep(1000);
		}
			catch(InterruptedException e){
				e.printStackTrace();
			}
	}
	}
}
class Mul2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Multithreading is being started");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Multithreading1 {
public static void main(String[] args) {
	Mul1 multithread=new Mul1();
	multithread.start();
	try {
		Thread.sleep(20);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
		
	}
	//multithread.setPriority(10);
	//System.out.println(multithread.getPriority());
	
	Mul2 multithread1=new Mul2();
	multithread1.start();
}
}
