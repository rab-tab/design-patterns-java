package BridgePattern;

public class Driver {
    public static void main(String[] args) {
        QRMessage qrMessage=new QRMessage(new SMS());
        qrMessage.sendMessage();
    }
}
