package Facade;

public class HardwareChecks {
    MotherBoard motherBoard;
    RAM ram;

    public HardwareChecks(MotherBoard motherBoard, RAM ram) {
        this.motherBoard = motherBoard;
        this.ram = ram;
    }

    boolean checkAllHardware(){

        return motherBoard.checkMotherBoardOnBoot() && ram.checkRAMOnBoot();
    }
}
