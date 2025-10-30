package notificationsystem.observer;


import notificationsystem.NotificationService;

public class Logger implements NotificationObserver {
    NotificationObservable notificationObservable;
    OBSERVER_TYPE type;

    public Logger() {
        notificationObservable = NotificationService.getInstance().getNotificationObservable();
        notificationObservable.addObserver(this);
        this.type = OBSERVER_TYPE.LOGGER;
    }


    public Logger(NotificationObservable notificationObservable) {
        this.notificationObservable = notificationObservable;
    }

    @Override
    public OBSERVER_TYPE getType() {
        return type;
    }

    @Override
    public void update() {
        System.out.println("Logging new notification content: " + notificationObservable.getNotification().getMessage());
    }
}
