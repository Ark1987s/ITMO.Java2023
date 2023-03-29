package Lab10;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex4 {
    public static void main(String[] args) {
        String line = "src/Lab10/files/probe.txt";
        replaceDataInFile(line);
    }

    static void replaceDataInFile(String string) {
        String search = "[^A-Za-zА-Яа-яёЁ0-9 ]";
        String replace = "\\$";
        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(string);
        try {
            Files.write(path, new String(Files.readAllBytes(path), charset).replaceAll(search, replace).getBytes(charset));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
