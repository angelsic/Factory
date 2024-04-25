public class AppNotification implements  INotification{
    @Override
    public void sendMessage(String message) {
        System.out.println("App Notification: " + message);
    }
}
