package encryptdecrypt;

abstract class AbstractEncryptor implements Encryptor {

    public abstract String encrypt(int shiftBy, String encrypt, char current);
    public abstract String decrypt(int shiftBy, String decrypted, char current);

    public String doEncrypt(String input, int shiftBy) {
        String encrypted = "";

        for (char current : input.toCharArray()) {
            encrypted = encrypt(shiftBy, encrypted, current);
        }
        return encrypted;
    }

    public String doDecrypt(String input, int shiftBy) {
        String decrypted = "";

        for (char current : input.toCharArray()) {
            decrypted = decrypt(shiftBy, decrypted, current);
        }
        return decrypted;
    }
}
