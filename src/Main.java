public class Main {
    public static void main(String[] args){

        FactoryNotification factoryNotification = new FactoryNotification();
        INotification email = factoryNotification.createNotification("Email");
        email.sendMessage("Use factory");
        INotification sms = factoryNotification.createNotification("SMS");
        sms.sendMessage("Use factory");
        INotification app = factoryNotification.createNotification("App");
        app.sendMessage("Use factory");

        UrgentFactoryNotification urgentFactoryNotification = new UrgentFactoryNotification();
        EmailNotification uemail = urgentFactoryNotification.createEmailNotification();
        uemail.sendMessage("Urgent Use Factory Notification");
        SMSNotification usms = urgentFactoryNotification.createSmsNotification();
        usms.sendMessage("Urgent Use Factory Notification");
        AppNotification uapp = urgentFactoryNotification.createAppNotification();
        uapp.sendMessage("Urgent Use Factory Notification");

        RegularFactoryNotification regularFactoryNotification = new RegularFactoryNotification();
        EmailNotification remail = regularFactoryNotification.createEmailNotification();
        remail.sendMessage("Regular Use Factory Notification");
        SMSNotification rsms = regularFactoryNotification.createSmsNotification();
        rsms.sendMessage("Regular Use Factory Notification");
        AppNotification rapp = regularFactoryNotification.createAppNotification();
        rapp.sendMessage("Regular Use Factory Notification");

    }
}
