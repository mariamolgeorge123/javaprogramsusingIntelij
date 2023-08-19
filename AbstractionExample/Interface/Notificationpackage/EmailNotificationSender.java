package AbstractionExample.Interface.Notificationpackage;

public class EmailNotificationSender implements NotificationSender,EmailNotification{
    @Override
    public void settingReceipeints() {
        System.out.println("Email::SettingReceipents");
    }

    @Override
    public void sendingEmailNotification() {
        System.out.println("Email:: sendingEmailNotification");

    }

    @Override
    public void sendNotification(String msg) {
        System.out.println("Email:: "+msg);
    }
}
