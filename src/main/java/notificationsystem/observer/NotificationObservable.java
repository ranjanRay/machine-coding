package notificationsystem.observer;


import notificationsystem.notifcation.Notification;

public interface NotificationObservable {
    public void addObserver(NotificationObserver observer);
    public void removeObserver(NotificationObserver observer);
    public void notifyObservers();
    public Notification getNotification();
    public void setNotification(Notification notification);
}
