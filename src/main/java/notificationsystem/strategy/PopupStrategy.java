package notificationsystem.strategy;


import notificationsystem.notifcation.Notification;

public class PopupStrategy implements NotificationStrategy {

    private String deviceId;
    public PopupStrategy(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void send(Notification notification) {
        System.out.println("Sending notification via popup to device: "+ deviceId);
    }
}
