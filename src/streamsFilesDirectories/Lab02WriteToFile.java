package streamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Lab02WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Programming docs\\Java advanced exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        List<Character> punctuation = Arrays.asList(',', '.', '!', '?');

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("D:\\Programming docs\\Java advanced exercises" +
                    "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt");
            int currentChar = inputStream.read();

            while (currentChar != -1) {

                if (!punctuation.contains((char) currentChar)) {
                    outputStream.write((char) currentChar);
                }

                currentChar = inputStream.read();
            }

            inputStream.close();
            outputStream.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }
}
