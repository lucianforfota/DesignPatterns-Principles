package factorymethod.notificationexample;

public class Client {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        try {
            Notification notification = notificationFactory.createNotification("email");
            notification.notifyUser();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
