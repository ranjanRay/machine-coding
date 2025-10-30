package notificationsystem.strategy;


import notificationsystem.notifcation.Notification;

public interface NotificationStrategy {
    public void send(Notification notification);
}
