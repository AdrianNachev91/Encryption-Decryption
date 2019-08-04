package encryptdecrypt;

import java.util.Scanner;

public class Options {

    private String targetOperation = "enc";
    private int shiftBy = 0;
    private String input = null;
    private String in = null;
    private String out = null;
    private String alg = "";

    public Options(String[] args) {
        parseArguments(args);
        if (in != null) {
            input = FileManipulator.getContentFromFile(in);
        }else if (input == null) {
            parseUserInput();
        }
    }

    private void parseArguments(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]) {
                case "-data":
                    input = args[i + 1].replace("\"", "");
                    break;
                case "-mode":
                    targetOperation = args[i + 1];
                    break;
                case "-key":
                    shiftBy = Integer.parseInt(args[i + 1]);
                    break;
                case "-in":
                    in = args[i + 1];
                    break;
                case "-out":
                    out = args[i + 1];
                    break;
                case "-alg":
                    alg = args[i + 1];
                    break;
            }
        }
    }

    private void parseUserInput() {
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        shiftBy = scanner.nextInt();
    }

    public String getTargetOperation() {
        return targetOperation;
    }

    public int getShiftBy() {
        return shiftBy;
    }

    public String getInput() {
        return input;
    }

    public String getOut() {
        return out;
    }

    public String getAlg() {
        return alg;
    }
}
