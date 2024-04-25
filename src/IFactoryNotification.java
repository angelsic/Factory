public interface IFactoryNotification {
    EmailNotification createEmailNotification();
    SMSNotification createSmsNotification();
    AppNotification createAppNotification();
}
