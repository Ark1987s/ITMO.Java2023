package Lab10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {
        String file = "src/Lab10/files/song.txt";
        List<String> textList = stringListFromFile(file);
        for (String lineText : textList)
            System.out.println(lineText);
    }

    static List<String> stringListFromFile(String line) {
        List<String> lines = new LinkedList<>();
        File file = new File(line);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input = reader.readLine();
            while (input != null) {
                lines.add(input);
                input = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return lines;
    }
}
