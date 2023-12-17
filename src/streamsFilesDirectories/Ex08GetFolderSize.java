package streamsFilesDirectories;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;

public class Ex08GetFolderSize {
    public static void main(String[] args) {

        Path path = Paths.get("D:\\Programming docs\\Java advanced exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");

        File file = path.toFile();

        ArrayDeque<File> fileQueue = new ArrayDeque<>();
        fileQueue.offer(file);
        long size = 0;

        while (!fileQueue.isEmpty()) {
            File currentFile = fileQueue.poll();
            File[] files = currentFile.listFiles();

            if(files != null ){
                for (File f : files) {
                    if(f.isDirectory()) {
                        fileQueue.offer(f);
                    } else {
                        size += f.length();
                    }
                }
            }
        }
        System.out.println("Folder size: " + size);
    }
}
