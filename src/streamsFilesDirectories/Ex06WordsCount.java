package streamsFilesDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Ex06WordsCount {
    public static void main(String[] args) throws IOException {

        try {
           Path firstFilePath = Paths.get("D:\\Programming docs\\Java advanced exercises" +
                    "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
            List<String> wordsToCompare = Files.readAllLines(firstFilePath);
            LinkedHashMap<String, Integer> wordsCountMap = new LinkedHashMap<>();
            wordsToCompare.forEach(text -> Arrays.stream(text.split("\\s+"))
                    .forEach(word -> wordsCountMap.put(word, 0)));

            FileReader secondFileRead = new FileReader("D:\\Programming docs\\Java advanced exercises" +
                    "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
            BufferedReader secondBuffReader = new BufferedReader(secondFileRead);
            String line = secondBuffReader.readLine();

            while (line != null) {
                for (String w: line.split("\\s+")) {
                    if(wordsCountMap.containsKey(w)) {
                        wordsCountMap.put(w, wordsCountMap.get(w) + 1);
                    }
                }
                line = secondBuffReader.readLine();
            }

            secondFileRead.close();
            secondBuffReader.close();

            wordsCountMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            PrintWriter writer = new PrintWriter("resultsEx06.txt");
            wordsCountMap.entrySet().forEach(e -> writer.printf("%s - %d%n", e.getKey(), e.getValue()));
            writer.close();

        } catch (IOException exception) {
            exception.getMessage();
        }
    }
}
