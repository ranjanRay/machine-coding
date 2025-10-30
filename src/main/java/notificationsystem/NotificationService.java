package notificationsystem;


import notificationsystem.notifcation.Notification;
import notificationsystem.observer.*;
import notificationsystem.strategy.NotificationStrategy;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private static NotificationObservable notificationObservable;
    private static NotificationService notificationService;
    private static List<NotificationStrategy> notificationStrategies;
    private static NotificationEngine notificationEngine;
    private static Logger logger;
    private static List<NotificationObserver> observers;

    private NotificationService() {
        notificationObservable = new NotificationObservableImpl();
        notificationStrategies = new ArrayList<>();
    }

    private static void createObservers() {
        observers = new ArrayList<>();
        notificationEngine = new NotificationEngine();
        logger = new Logger();
        observers.add(notificationEngine);
        observers.add(logger);
    }

    public List<NotificationObserver> getObservers() {
        return observers;
    }

    public boolean removeObserver(NotificationObserver observer) {
        notificationObservable.removeObserver(observer);
        return observers.remove(observer);
    }

    public static NotificationService getInstance() {
        if(notificationService == null) {
            synchronized (NotificationService.class) {
                if(notificationService == null) {
                    notificationService = new NotificationService();
                }
            }
            createObservers();
        }
        return notificationService;
    }

    public NotificationObservable getNotificationObservable() {
        return notificationObservable;
    }

    public void setNotificationStrategies(List<NotificationStrategy> notificationStrategies) {
        NotificationService.notificationStrategies = notificationStrategies;
        notificationEngine.setNotificationStrategies(notificationStrategies);
    }

    public void sendNotification(Notification notification) {
        System.out.println("[NotificationService]: Sending notification: " + notification.getMessage());
        notificationObservable.setNotification(notification);
    }

    public List<Notification> getNotifications() {
        return notificationEngine.getHistory();
    }
}
