package streamsFilesDirectories;

import java.io.*;

public class Lab05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String filePath = "D:\\Programming docs\\Java advanced exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileReader fileReader = new FileReader(filePath);
        FileWriter fileWriter = new FileWriter("5thProblem.txt");

        BufferedReader bufferedReaderIn = new BufferedReader(fileReader);
        PrintWriter printWriterOut = new PrintWriter(fileWriter);

        String line = bufferedReaderIn.readLine();

        int rowCount = 1;

            while (line != null) {
                if (rowCount % 3 == 0) {
                    printWriterOut.println(line);
                }
                line = bufferedReaderIn.readLine();
                rowCount++;
            }

            printWriterOut.flush();
    }
}
