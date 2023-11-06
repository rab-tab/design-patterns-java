package ChainOfResponsibility.Logger1;

public class Driver {
    public static void main(String[] args) {
        LogProcessor logProcessor=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR,"Exception happens");
        logProcessor.log(LogProcessor.DEBUG,"debug");
        logProcessor.log(LogProcessor.INFO,"info");

    }
}
