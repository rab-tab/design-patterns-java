package Facade;

public class SoftwareCheck {
    OSCheckOnBoot osCheckOnBoot;
    DriverCheck driverCheck;

    public SoftwareCheck(OSCheckOnBoot osCheckOnBoot, DriverCheck driverCheck) {
        this.osCheckOnBoot = osCheckOnBoot;
        this.driverCheck = driverCheck;
    }

    boolean checkSoftwareOnBoot(){
        return osCheckOnBoot.checkOSOnBoot() && driverCheck.checkDriverOnBoot();
    }
}
