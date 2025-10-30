package notificationsystem.observer;

public interface NotificationObserver {
    OBSERVER_TYPE getType();
    void update();
}
