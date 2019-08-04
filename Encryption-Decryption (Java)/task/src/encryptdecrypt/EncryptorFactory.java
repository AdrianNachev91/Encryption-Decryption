package encryptdecrypt;

public class EncryptorFactory {

    public Encryptor encryptor(String alg) {
        if (alg.equals("unicode")) {
            return new UnicodeEncryptor();
        } else {
            return new ShiftEncryptor();
        }
    }
}
