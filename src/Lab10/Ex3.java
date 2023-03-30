package Lab10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ex3 {
    public static void main(String[] args) {
        String fileInput = "src/Lab10/files/message.txt";
        writeString(textFile(fileInput));
    }

    static String textFile(String line) {
        String stringReader = "";
        File file = new File(line);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            stringReader = reader.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return stringReader;
    }

    static void writeString(String string) {
        try {
            Files.writeString(Paths.get("src/Lab10/files/song.txt"), string, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
