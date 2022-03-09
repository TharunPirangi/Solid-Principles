package solidprinciples.codewithsolid.notifications;

// liskov substitution principle is used here
// as EmailNotification has completely become substitutable for their base class

public class EmailNotification implements Notification{

    @Override
    public void sendNotification(String to) {

    }
}