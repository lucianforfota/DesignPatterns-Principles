package factorymethod.notificationexample;

import factorymethod.tableexample.KitchenTable;
import factorymethod.tableexample.OfficeTable;
import factorymethod.tableexample.Table;

public class NotificationFactory {

    public Notification createNotification(String type)  throws  Exception{
        if (type.equals("sms")){
            return new SMSNotfication();
        } else if (type.equals("email")){
            return new EmailNotification();
        } else {
            throw new Exception("can't create this type of notification");
        }
    }
}
