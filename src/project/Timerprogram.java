package project;

interface Timer{
	void startTesttimer(String subject,int duration) throws InterruptedException;
}
class Examtimer implements Timer{
	public void startTesttimer(String subject,int duration) throws InterruptedException
	{
		   System.out.println(" Starting " + subject + " test for " + duration + " seconds.");	
            for(int i=duration;i>0;i--)
            {
	       System.out.println(" " + i + " seconds remaining...");
	       Thread.sleep(2000);
} 
            System.out.println("Task completed");
            System.out.println("‍ Time to take a short break!\n");
	}
public class Timerprogram {
	public static void main(String[] args) throws InterruptedException {
		Timer timer =new Examtimer();
		timer.startTesttimer("Java", 10);
		timer.startTesttimer("Python", 15);
	}
}
}
