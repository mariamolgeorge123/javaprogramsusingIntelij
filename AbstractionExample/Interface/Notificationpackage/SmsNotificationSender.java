package AbstractionExample.Interface.Notificationpackage;

public class SmsNotificationSender implements NotificationSender,SmsNotification{
    @Override
    public void sendNotification(String msg) {
        System.out.println("SMS:: "+msg);
    }

    @Override
    public void specifyingPhoneNumber() {
        System.out.println("SMS :: specify phone number");
    }

    @Override
    public void sendingSmsNotifications() {
        System.out.println("SMS:: Sending SMS");
    }
}
