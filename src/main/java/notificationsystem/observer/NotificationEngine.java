package notificationsystem.observer;


import notificationsystem.NotificationService;
import notificationsystem.notifcation.Notification;
import notificationsystem.strategy.NotificationStrategy;

import java.util.ArrayList;
import java.util.List;

public class NotificationEngine implements NotificationObserver {
    private NotificationObservable notificationObservable;
    private List<NotificationStrategy> notificationStrategies;
    private OBSERVER_TYPE observerType;
    private List<Notification> history;

    public NotificationEngine() {
        notificationObservable = NotificationService.getInstance().getNotificationObservable();
        notificationObservable.addObserver(this);
        this.observerType = OBSERVER_TYPE.NOTIFICATION_ENGINE;
        history = new ArrayList<>();
    }

    public NotificationEngine(NotificationObservable notificationObservable) {
        this.notificationObservable = notificationObservable;
        this.notificationObservable.addObserver(this);
        this.observerType = OBSERVER_TYPE.NOTIFICATION_ENGINE;
    }

    public void setNotificationStrategies(List<NotificationStrategy> notificationStrategies) {
        this.notificationStrategies = notificationStrategies;
    }

    public List<Notification> getHistory() {
        return history;
    }

    @Override
    public OBSERVER_TYPE getType() {
        return observerType;
    }

    @Override
    public void update() {
        history.add(notificationObservable.getNotification());
        for(NotificationStrategy notificationStrategy : notificationStrategies) {
            notificationStrategy.send(notificationObservable.getNotification());
        }
    }
}
