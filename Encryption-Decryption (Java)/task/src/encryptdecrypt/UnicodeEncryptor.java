package encryptdecrypt;

import org.jetbrains.annotations.NotNull;

public class UnicodeEncryptor extends AbstractEncryptor {

    @Override
    public String encrypt(int shiftBy, String encrypted, char current) {
        encrypted += (char)(current + shiftBy);
        return encrypted;
    }

    @NotNull
    public String decrypt(int shiftBy, String decrypted, char current) {
        decrypted += (char)(current - shiftBy);
        return decrypted;
    }
}
