package BridgePattern;

public class QRMessage extends Notification {
    public QRMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is the QR Code");
    }

    @Override
    void sendMessage() {
        notificationSender.sendNotification();
    }
}
