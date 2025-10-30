package notificationsystem.notifcation;

import java.util.Date;

public abstract class Notification {
    private String title;
    private String message;
    private Date date;
    private String signedBy;

    public Notification() {}

    public Notification(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSignedBy() {
        return signedBy;
    }

    public void setSignedBy(String signedBy) {
        this.signedBy = signedBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
