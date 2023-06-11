package Prototype;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String data;

    public NetworkConnection() {
    }

    public NetworkConnection(String ip, String data) {
        this.ip = ip;
        this.data = data;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void init(){

    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO: Your custom clone logic
        return super.clone();
    }
}
