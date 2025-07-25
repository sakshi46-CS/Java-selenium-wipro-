package project;

interface Attendance{
	void startattendancetimer(int seconds) throws InterruptedException;
}
public class Attendancesystem implements Attendance {
public void startattendancetimer(int seconds) throws InterruptedException {
	System.out.println("Attendace timer is being started");
	for(int i=seconds;i>0;i--) {
        System.out.println("⏳ " + i + " seconds remaining to mark attendance...");
        Thread.sleep(2000);
  
	}
	System.out.println("Attendance window is now closed!!");
}
}
