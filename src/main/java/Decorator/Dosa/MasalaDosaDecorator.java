package Decorator.Dosa;

public class MasalaDosaDecorator extends DosaDecorator {
    public MasalaDosaDecorator(Dosa dosa) {
        super(dosa);
    }

    public String prepareDosa() {
        return dosa.prepareDosa() + " -- " +addMasala();
    }

    private Object addMasala() {
        return "Msasala added";
    }

}
