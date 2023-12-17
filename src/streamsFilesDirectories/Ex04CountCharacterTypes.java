package streamsFilesDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class Ex04CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        try {

            FileReader reader = new FileReader("D:\\Programming docs\\Java advanced exercises\\" +
                    "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

            BufferedReader bufferedReader = new BufferedReader(reader);
            PrintWriter printer = new PrintWriter("outputEx04.txt");

            List<Integer> punctuationSymbolsList = Arrays.asList(44, 46, 63, 33);
            List<Integer> vowelsList = Arrays.asList(97, 101, 105, 111, 117);

            int vowelsCount = 0;
            int otherSymbols = 0;
            int punctuation = 0;

            int currentChar = bufferedReader.read();
            while (currentChar != -1) {

                if (punctuationSymbolsList.contains(currentChar)) {
                    punctuation++;
                }
                if (vowelsList.contains(currentChar)) {
                    vowelsCount++;
                }
                if (currentChar != 32 && currentChar != 10 && currentChar != 13
                        && !vowelsList.contains(currentChar)
                        && !punctuationSymbolsList.contains(currentChar)) {
                    otherSymbols++;
                }

                currentChar = bufferedReader.read();
            }
            bufferedReader.close();
            printer.printf("Vowels: %d%n", vowelsCount);
            printer.printf("Other symbols: %d%n", otherSymbols);
            printer.printf("Punctuation: %d%n", punctuation);

            printer.close();

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
