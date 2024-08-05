package factorymethod.notificationexample;

public class SMSNotfication extends Notification{
    @Override
    public void notifyUser() {
        System.out.println("sending a sms notification");
    }
}
