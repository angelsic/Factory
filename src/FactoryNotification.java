public class FactoryNotification {
    public INotification createNotification(String type){
        if(type.equals("Email")){
            return new EmailNotification();
        }else if(type.equals("SMS")){
            return new SMSNotification();
        }else if(type.equals("App")){
            return new AppNotification();
        }

        throw new IllegalArgumentException("Unknown notification type");
    }
}
