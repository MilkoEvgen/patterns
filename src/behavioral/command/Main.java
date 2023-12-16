package behavioral.command;

public class Main {
    public static void main(String[] args) {
        MessageSender sender = new MessageSender();
        Command email = new EmailCommand(sender);
        Command sms = new SmsCommand(sender);

        email.execute("hello", "mail@mail.com");
        sms.execute("Hi!", "123456789");
    }
}
