package Flyweight.withFlyWeight;

public class Main {
    public static void main(String[] args) {
        ILetter object1 = LetterFactory.crateLetter('t');
        object1.display(0,0);

        ILetter object2 = LetterFactory.crateLetter('t');
        object1.display(0,6);


    }
}
