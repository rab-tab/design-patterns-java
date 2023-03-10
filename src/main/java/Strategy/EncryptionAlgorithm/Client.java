package Strategy.EncryptionAlgorithm;

public class Client {
    public static void main(String[] args) {
        EncryptionContext encryptionContext=new EncryptionContext();
        encryptionContext.setEncoding(new MD5Encryption());
        encryptionContext.encrypt("abc");

    }
}
