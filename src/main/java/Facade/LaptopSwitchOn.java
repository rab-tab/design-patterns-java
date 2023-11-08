package Facade;

public class LaptopSwitchOn {

    SoftwareCheck softwareCheck;
    HardwareChecks hardwareChecks;

    public LaptopSwitchOn() {
    }

    public LaptopSwitchOn(SoftwareCheck softwareCheck, HardwareChecks hardwareChecks) {
        this.softwareCheck = softwareCheck;
        this.hardwareChecks = hardwareChecks;
    }

    void switchOnLaptop() {
        if (hardwareChecks.checkAllHardware() && softwareCheck.checkSoftwareOnBoot()) {
            System.out.println("Switching on laptop");
        }
    }
}
