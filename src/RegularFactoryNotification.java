public class RegularFactoryNotification implements IFactoryNotification{
    @Override
    public EmailNotification createEmailNotification() {
        return new EmailNotification();
    }

    @Override
    public SMSNotification createSmsNotification() {
        return new SMSNotification();
    }

    @Override
    public AppNotification createAppNotification() {
        return new AppNotification();
    }
}
