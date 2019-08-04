package encryptdecrypt;

public interface Encryptor {

    String doEncrypt(String input, int shiftBy);
    String doDecrypt(String input, int shiftBy);
}
