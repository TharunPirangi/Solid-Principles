package solidprinciples.codewithoutsolid.notifications;

// violates lsp as MessageNotification is not a substitute of Notification

public class MessageNotification implements Notification {
    @Override
    public void sendMessageNotification(String to) {
        // logic for message notification
    }

    @Override
    public void sendEmailNotification(String gto) {
        //not applicable
    }
}
