package streamsFilesDirectories;

import java.io.*;

public class Ex03AllCapitals {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Programming docs\\Java advanced exercises\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        FileReader fileReader = new FileReader(path);
        BufferedReader readFile = new BufferedReader(fileReader);
        PrintWriter print = new PrintWriter("outputEx03.txt");

        String line = readFile.readLine();

        while (line != null) {
            print.println(line.toUpperCase());

            line = readFile.readLine();
        }

        readFile.close();
        print.flush();
    }
}
