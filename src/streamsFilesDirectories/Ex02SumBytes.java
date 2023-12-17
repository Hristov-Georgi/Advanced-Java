package streamsFilesDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex02SumBytes {
    public static void main(String[] args) throws IOException {

        long sumBytes = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Programming docs" +
                    "\\Java advanced exercises" +
                    "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
            String line = reader.readLine();

            while (line != null) {
                for (char b: line.toCharArray()) {
                    sumBytes += b;
                }
                line = reader.readLine();
            }
            System.out.println(sumBytes);

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
