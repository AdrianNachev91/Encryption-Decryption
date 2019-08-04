package encryptdecrypt;

import static encryptdecrypt.FileManipulator.*;

public class Main {
    public static void main(String[] args) {

        Options options = new Options(args);
        EncryptorFactory encryptorFactory = new EncryptorFactory();
        Encryptor encryptor = encryptorFactory.encryptor(options.getAlg());

        if (options.getInput() != null) {
            String result;
            if (options.getTargetOperation().equals("enc")) {
                result = encryptor.doEncrypt(options.getInput(), options.getShiftBy());
            } else {
                result = encryptor.doDecrypt(options.getInput(), options.getShiftBy());
            }

            if (options.getOut() != null) {
                writeResultToFile(result, options.getOut());
            } else {
                System.out.println(result);
            }
        } else {
            System.out.println("Input not specified");
        }
    }
}
