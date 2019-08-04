package encryptdecrypt;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManipulator {

    public static String getContentFromFile(String in) {
        try {
            return new String(Files.readAllBytes(Paths.get(in)));
        } catch (IOException e) {
            System.out.println("Input file not found in path: " + in);
        }
        return null;
    }

    public static void writeResultToFile(String result, String out) {
        try (FileWriter writer = new FileWriter(out)) {
            writer.write(result);
        } catch (IOException e) {
            System.out.println("Could nto write to file: " + out);
        }

    }
}
