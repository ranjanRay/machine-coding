package notificationsystem.decorator;


import notificationsystem.notifcation.Notification;

import java.time.Instant;
import java.util.Date;

public class TimestampDecorator extends NotificationDecorator {
    public TimestampDecorator(Notification notification) {
        super(notification);
    }

    public Notification getNotification() {
        this.notification.setDate(Date.from(Instant.EPOCH));
        return this.notification;
    }
}
