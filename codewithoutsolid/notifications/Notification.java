package solidprinciples.codewithoutsolid.notifications;

public interface Notification {
    void sendMessageNotification(String to);
    void sendEmailNotification(String to);
}