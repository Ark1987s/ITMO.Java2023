package Lab10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex2 {
    public static void main(String[] args) {
        writeText("C'est la vie, cher ami!");
    }

    static void writeText(String string) {
        try {
            Files.writeString(Paths.get("src/Lab10/files/message.txt"), string);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
