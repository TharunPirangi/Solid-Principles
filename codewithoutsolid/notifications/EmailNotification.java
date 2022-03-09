package solidprinciples.codewithoutsolid.notifications;

// this class violates liskov substitution principle
// EmailNotification(derived class) is not the perfect substitute of Notification(base class)

public class EmailNotification implements Notification {
    @Override
    public void sendMessageNotification(String to) {
        // not applicable
    }

    @Override
    public void sendEmailNotification(String to) {
        // logic to send email notification
    }
}