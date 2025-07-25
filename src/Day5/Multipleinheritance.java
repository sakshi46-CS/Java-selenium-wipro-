package Day5;

// Interface 1
interface EmailSender {
    void sendMessage(String message);
}

// Interface 2
interface SMSSender {
    void sendMessage(String message);
}

// Implementing class
class NotificationService implements EmailSender, SMSSender {
    public void sendMessage(String message) {
        System.out.println("Sending notification: " + message);
    }
}

// Main class
public class Multipleinheritance {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendMessage("Your OTP is 123456");
    }
}
