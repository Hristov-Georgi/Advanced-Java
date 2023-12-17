package streamsFilesDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class Lab01ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Programming docs\\Java advanced exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            int value = inputStream.read();

            while (value != -1) {
                //System.out.printf("%s ", Integer.toBinaryString(value));
                System.out.println(value);

                value = inputStream.read();
            }

        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
