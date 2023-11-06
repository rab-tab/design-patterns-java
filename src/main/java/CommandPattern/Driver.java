package CommandPattern;

public class Driver {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new TurnACOnCommand(airConditioner));
        remoteControl.pressButton();
    }
}
