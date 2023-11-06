package CommandPattern;

public class TurnACOnCommand implements Command {

    AirConditioner airConditioner;

    public TurnACOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAC();

    }

    @Override
    public void undo() {
        airConditioner.turnOffAC();
    }
}
