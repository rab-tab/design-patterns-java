package Strategy.EncryptionAlgorithm;

public class EncryptionContext {
    Encryption encoding;

    public void setEncoding(Encryption encoding) {
        this.encoding = encoding;
    }

    public void encrypt(String data) {
        encoding.encrypt(data);
    }
}
