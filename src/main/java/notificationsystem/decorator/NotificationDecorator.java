package notificationsystem.decorator;


import notificationsystem.notifcation.Notification;

abstract public class NotificationDecorator extends Notification {
    Notification notification;
    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

//    abstract Notification getNotification();
}
