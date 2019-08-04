package encryptdecrypt;

public class ShiftEncryptor extends AbstractEncryptor {

    public String encrypt(int shiftBy, String encrypted, char current) {
        if (Character.isAlphabetic(current)) {
            for (int i = 1; i <= shiftBy; i++) {
                if (current == 'Z') {
                    current = 'A';
                } else if (current == 'z') {
                    current = 'a';
                } else {
                    current++;
                }
            }
        }
        encrypted += current;
        return encrypted;
    }

    public String decrypt(int shiftBy, String decrypted, char current) {
        if (Character.isAlphabetic(current)) {
            for (int i = 1; i <= shiftBy; i++) {
                if (current == 'A') {
                    current = 'Z';
                } else if (current == 'a') {
                    current = 'z';
                } else {
                    current--;
                }
            }
        }
        decrypted += current;
        return decrypted;
    }
}
