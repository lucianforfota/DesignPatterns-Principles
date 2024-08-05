package factorymethod.notificationexample;

public class EmailNotification extends Notification{
    @Override
    public void notifyUser() {
        System.out.println("sending a email notification");
    }
}
