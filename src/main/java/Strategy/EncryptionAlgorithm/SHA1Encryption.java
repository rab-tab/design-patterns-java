package Strategy.EncryptionAlgorithm;

public class SHA1Encryption implements Encryption{
    @Override
    public void encrypt(String data) {
        System.out.println("SHA1 Encryption method");
    }
}
