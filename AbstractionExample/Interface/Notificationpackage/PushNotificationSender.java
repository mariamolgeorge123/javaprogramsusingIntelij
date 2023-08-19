package AbstractionExample.Interface.Notificationpackage;

public class PushNotificationSender implements NotificationSender,PushNotification{
    @Override
    public void sendNotification(String msg) {
        System.out.println("Push  Notification:: "+msg);
    }

    @Override
    public void sendingPushNotification() {
        System.out.println("push Notification:: Sending push notification");
    }
}
