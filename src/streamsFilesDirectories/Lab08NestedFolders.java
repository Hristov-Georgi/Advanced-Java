package streamsFilesDirectories;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;

public class Lab08NestedFolders {
    public static void main(String[] args) {

        Path path = Paths.get("D:\\Programming docs\\Java advanced exercises\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File start = path.toFile();

        ArrayDeque<File> queue = new ArrayDeque<>();
        queue.offer(start);

        int folderCount = 0;

        while (!queue.isEmpty()) {
            File file = queue.poll();
            File[] files = file.listFiles();
            System.out.println(file.getName());
            folderCount++;

            if (files != null) {

                for (File f: files ) {

                    if (f.isDirectory()) {
                        queue.offer(f);
                    }
                }
            }
        }

        System.out.println(folderCount + " folders");
    }
}
