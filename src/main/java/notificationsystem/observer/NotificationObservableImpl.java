package notificationsystem.observer;


import notificationsystem.notifcation.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationObservableImpl implements NotificationObservable {
    private final List<NotificationObserver> observers;
    private Notification notification;

    public NotificationObservableImpl() {
        observers = new ArrayList<>();
        this.notification = null;
    }

    public Notification getNotification() {
        return this.notification;
    }

    @Override
    public void setNotification(Notification notification) {
        this.notification = notification;
        System.out.println("Setting the notification to " + notification.getMessage() + "inside the NotificationObservableImpl");
        notifyObservers();
    }

    @Override
    public void addObserver(NotificationObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver observer : observers) {
            observer.update();
        }
    }
}
