package Flyweight.withoutFlyWeight;

public class Character {
    char Character;
    String fontType;
    int size;
    int row;
    int col;

    public Character(char character, String fontType, int size, int row, int col) {
        Character = character;
        this.fontType = fontType;
        this.size = size;
        this.row = row;
        this.col = col;
    }

    public char getCharacter() {
        return Character;
    }

    public void setCharacter(char character) {
        Character = character;
    }

    public String getFontType() {
        return fontType;
    }

    public void setFontType(String fontType) {
        this.fontType = fontType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
