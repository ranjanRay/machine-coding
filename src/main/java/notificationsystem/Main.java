package notificationsystem;


import notificationsystem.decorator.SignatureDecorator;
import notificationsystem.decorator.TimestampDecorator;
import notificationsystem.notifcation.Notification;
import notificationsystem.notifcation.SimpleNotification;
import notificationsystem.observer.NotificationObserver;
import notificationsystem.strategy.EmailStrategy;
import notificationsystem.strategy.NotificationStrategy;
import notificationsystem.strategy.PopupStrategy;
import notificationsystem.strategy.SMSStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        NotificationService notificationService = NotificationService.getInstance();

        List<NotificationStrategy> strategies = new ArrayList<>();
        strategies.add(new EmailStrategy("abcd@gmail.com"));
        strategies.add(new SMSStrategy("+0909987777"));
        strategies.add(new PopupStrategy("dev-1233456"));
        notificationService.setNotificationStrategies(strategies);

        Notification notification = new SimpleNotification("order-shipment", "Your order has been shipped.");
        System.out.println("title: "+ notification.getTitle() + "message: " + notification.getMessage());
        notification = new TimestampDecorator(notification).getNotification();
        notification = new SignatureDecorator(notification, "Rajeev").getNotification();
        System.out.println("title: "+ notification.getTitle() + "message: " + notification.getMessage() + "at: "+ notification.getDate());
        notificationService.sendNotification(notification);
        System.out.println("Sent notifcation");

        List<NotificationObserver> observers = notificationService.getObservers();
        for (NotificationObserver observer : observers) {
            System.out.println("observer: " + observer.getType());
        }

        List<Notification> history = notificationService.getNotifications();
        for (Notification n : history) {
            System.out.println("notification: " + n.getMessage());
        }
    }
}
