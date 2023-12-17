package streamsFilesDirectories;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lab07ListFiles {
    public static void main(String[] args) {

        Path path = Paths.get("D:\\Programming docs\\Java advanced exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File file = path.toFile();

        File[] pathFiles = file.listFiles();

        for (File f: pathFiles) {
            if(f.isFile()) {
                System.out.printf("%s: [%d]%n", f.getName(), f.length());
            }
        }
    }
}
