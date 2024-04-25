public class SMSNotification implements INotification{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
