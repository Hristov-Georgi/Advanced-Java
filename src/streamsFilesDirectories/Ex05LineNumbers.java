package streamsFilesDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex05LineNumbers {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("D:\\Programming docs\\Java advanced exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");
        BufferedReader buffReader = new BufferedReader(reader);
        PrintWriter printWriter = new PrintWriter("outputEx05.txt");
        String line = buffReader.readLine();
        int lineNumber = 1;

        while (line != null) {
            printWriter.printf("%d. %s%n", lineNumber++, line);

            line = buffReader.readLine();
        }
        buffReader.close();
        printWriter.close();
    }
}
