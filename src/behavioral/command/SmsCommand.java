package behavioral.command;

public class SmsCommand implements Command{
    private MessageSender sender;

    public SmsCommand(MessageSender sender) {
        this.sender = sender;
    }

    @Override
    public void execute(String message, String resource) {
        sender.sendSms(message, resource);
    }
}
