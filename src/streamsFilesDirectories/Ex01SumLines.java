package streamsFilesDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex01SumLines {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Programming docs\\Java advanced exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine();

            while (line != null) {
                long sum = 0;

                for (char symbol: line.toCharArray()) {
                    sum += symbol;
                }
                System.out.println(sum);

                line = bufferedReader.readLine();
            }

        } catch (IOException e){
           System.out.println(e.getMessage());

        }

    }
}
