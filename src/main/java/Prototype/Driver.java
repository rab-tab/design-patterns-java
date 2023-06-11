package Prototype;

public class Driver {
    public static void main(String[] args) {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.init();
        System.out.println(networkConnection);

        try {
            NetworkConnection clonedObj = (NetworkConnection) networkConnection.clone();
            System.out.println(clonedObj);
        } catch (CloneNotSupportedException ex) {

        }
    }
}
