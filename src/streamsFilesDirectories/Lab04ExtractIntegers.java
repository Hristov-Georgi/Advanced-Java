package streamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Lab04ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Programming docs\\Java advanced exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("4thProblem.txt");

        PrintStream printStream = new PrintStream(outputStream);

        Scanner scanner = new Scanner(inputStream);

        while(scanner.hasNext()) {

            if(scanner.hasNextInt()) {
              printStream.println(scanner.nextInt());
            }
            scanner.next();
        }
    }
}
