package Decorator.Dosa;

public abstract class DosaDecorator {

    Dosa dosa;

    public DosaDecorator(Dosa dosa) {
        this.dosa = dosa;
    }

    public String prepareDosa() {
        return dosa.prepareDosa();
    }
}


