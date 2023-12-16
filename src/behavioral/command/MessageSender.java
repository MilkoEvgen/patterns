package behavioral.command;

public class MessageSender {
    void sendEmail(String message, String email){
        System.out.println("Sending \"" + message + "\" to email: " + email);
    }

    void sendSms(String message, String phoneNumber){
        System.out.println("Sending \"" + message + "\" to number " + phoneNumber);
    }
}
