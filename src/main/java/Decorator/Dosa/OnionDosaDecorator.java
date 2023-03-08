package Decorator.Dosa;

public class OnionDosaDecorator extends DosaDecorator {
    public OnionDosaDecorator(Dosa dosa) {
        super(dosa);
    }

    public String prepareDosa() {
        return dosa.prepareDosa() + " --- " + addOnion();
    }

    private String addOnion() {
        return "Onions added..";
    }
}
