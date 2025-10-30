package notificationsystem.decorator;


import notificationsystem.notifcation.Notification;

public class SignatureDecorator extends NotificationDecorator {
    private String signature;
    public SignatureDecorator(Notification notification, String signature) {
        super(notification);
        this.signature = signature;
    }

    public Notification getNotification() {
        this.notification.setSignedBy(this.signature);
        return this.notification;
    }
}
