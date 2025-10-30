package notificationsystem.strategy;


import notificationsystem.notifcation.Notification;

public class EmailStrategy implements NotificationStrategy {

    private String email;
    public EmailStrategy(String email) {
        this.email = email;
    }
    @Override
    public void send(Notification notification) {
        System.out.println("Emailing notification to " + email + ": " + notification.getMessage());
    }
}
