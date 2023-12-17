package streamsFilesDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ex07MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        Path readFirstFile = Paths.get("D:\\Programming docs\\Java advanced exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");

        Path readSecondFile = Paths.get("D:\\Programming docs\\Java advanced exercises" +
                                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");

        PrintWriter file = new PrintWriter("outputEx07.txt");

        List<String> mergedFiles = new ArrayList<>();

        mergedFiles.add(String.valueOf(Files.readAllLines(readFirstFile)));
        mergedFiles.add(String.valueOf(Files.readAllLines(readSecondFile)));

        String symbols = mergedFiles.toString().replaceAll("[\\[\\], ]", "");

        for (char element : symbols.toCharArray()) {
            file.println(element);
        }

        file.close();
    }
}
