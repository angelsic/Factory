public class EmailNotification implements INotification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
