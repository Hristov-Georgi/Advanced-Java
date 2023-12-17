package streamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Lab03CopyBites {
    public static void main(String[] args) throws IOException {

        try {

            FileInputStream inputStream =
                    new FileInputStream("D:\\Programming docs\\Java advanced exercises" +
                            "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

            FileOutputStream outputStream = new FileOutputStream("3rdProblem.txt");

            PrintStream outPrint = new PrintStream(outputStream);

            int singleValue = inputStream.read();

            while (singleValue != -1) {

                if(singleValue != 10 && singleValue != 32) {
                    outPrint.print(singleValue);

                } else {
                    outPrint.print((char) singleValue);

                }
                singleValue = inputStream.read();
            }

            inputStream.close();
            outputStream.close();

        } catch (IOException e){

            System.out.println(e.getMessage());

        }
    }
}
