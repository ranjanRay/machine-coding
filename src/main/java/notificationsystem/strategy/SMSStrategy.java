package notificationsystem.strategy;


import notificationsystem.notifcation.Notification;

public class SMSStrategy implements NotificationStrategy {
    private String phoneNumber;
    public SMSStrategy(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void send(Notification notification) {
        System.out.println("SMSing notification with content: "+ notification.getMessage() + "to phone number" + phoneNumber);
    }
}
