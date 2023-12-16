package behavioral.command;

public class EmailCommand implements Command{
    private MessageSender sender;

    public EmailCommand(MessageSender sender) {
        this.sender = sender;
    }

    @Override
    public void execute(String message, String resource) {
        sender.sendEmail(message, resource);
    }
}
