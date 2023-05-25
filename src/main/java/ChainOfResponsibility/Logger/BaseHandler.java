package ChainOfResponsibility.Logger;

public abstract class BaseHandler implements handler {
    protected handler nextHandler;

    public void setNextHandler(handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
