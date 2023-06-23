package Adapter.languageTransalator;

public class Rohit implements FrenchSpeaker {

    public static void main(String args[]) {
        String replyFromDavid = new Rohit().askQuestion("où êtes-vous?");
        System.out.println("Reply From David [English Speaker can Speak and Understand only English] :  " + replyFromDavid);
    }

    @Override
    public String askQuestion(String words) {
        System.out.println("Question Asked by Rohit [French Speaker and Can understand only French] : " + words);
        ITarget target = new John();
        String replyFromDavid = target.translate(words, "English");
        return replyFromDavid;
    }

    @Override
    public String answerQuestion(String words) {
        String reply = null;
        if (words.equalsIgnoreCase("comment allez-vous?")) {
            reply = "Je suis très bien";
        }
        return reply;
    }
}
