package CommandPattern;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAC(){
        isOn=true;
        System.out.println("AC is turnd ON");
    }
    public void turnOffAC(){
        isOn=false;
        System.out.println("AC is turned OFF");
    }

    public void setTemperature(int temp){
        this.temperature=temp;
    }

}
