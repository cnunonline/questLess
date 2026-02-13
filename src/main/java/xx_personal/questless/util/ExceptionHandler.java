package xx_personal.questless.util;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandler {
    public static void handleIOException(IOException e) {
        System.err.println(e.getMessage());
        System.exit(1);
    }

    public static void handleFileNotFound(FileNotFoundException e) {
        System.err.println(e.getMessage());
        System.exit(1);
    }
}
