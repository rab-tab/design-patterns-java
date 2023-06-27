package Flyweight.withFlyWeight;

public class DocumentCharacter implements ILetter {
    //intrinsic data
    private char character;
    private String fontType;
    private int size;

    public DocumentCharacter(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    @Override// extrinsic data passed as parameters
    public void display(int row, int column) {


    }
}
