package AbstractionExample.Interface.Notificationpackage;

public class NotificationRunner {
    public static void main(String[] args) {

        NotificationSender e1=new EmailNotificationSender();
        NotificationSender p1 = new PushNotificationSender();
        NotificationSender s1 = new SmsNotificationSender();
        e1.sendNotification("message ::Email");
        p1.sendNotification("message ::push");
        s1.sendNotification("message::sms");


        if (e1 instanceof EmailNotificationSender) {
            EmailNotificationSender emailSender = (EmailNotificationSender) e1;
            emailSender.sendingEmailNotification();
            emailSender.settingReceipeints();


        }

        if (p1 instanceof PushNotificationSender) {
            PushNotificationSender pushSender = (PushNotificationSender) p1;
            pushSender.sendingPushNotification();
        }

        if (s1 instanceof SmsNotificationSender) {
            SmsNotificationSender smsSender = (SmsNotificationSender) s1;
            smsSender.sendingSmsNotifications();
            smsSender.specifyingPhoneNumber();
        }
    }
}









//        EmailNotificationSender e = new EmailNotificationSender();
//        PushNotificationSender p = new PushNotificationSender();
//        SmsNotificationSender s = new SmsNotificationSender();
//        NotificationSender[] notifications = {e, p, s};
//        for (NotificationSender notification : notifications) {
//            notification.sendNotification("Message from Runner");
//            if(notification instanceof EmailNotification)
//            {
//                EmailNotification en=(EmailNotification) notification;
//                en.sendingEmailNotification();
//                en.settingReceipeints();
//            }
//            if(notification instanceof PushNotification)
//            {
//                ((PushNotification) notification).sendingPushNotification();
//            }
//            if (notification instanceof SmsNotification)
//            {
//                ((SmsNotification) notification).specifyingPhoneNumber();
//                ((SmsNotification) notification).sendingSmsNotifications();
//            }
//        }

//    }
//
//}
