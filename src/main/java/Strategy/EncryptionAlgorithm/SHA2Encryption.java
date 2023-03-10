package Strategy.EncryptionAlgorithm;

public class SHA2Encryption implements Encryption{
    @Override
    public void encrypt(String data) {
        System.out.println("SHA2");
    }
}
