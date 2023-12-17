package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printingQueue = new ArrayDeque<>();
        String fileNames = scanner.nextLine();

        while (!fileNames.equals("print")) {

            if (fileNames.equals("cancel")) {
               if(printingQueue.isEmpty()) {
                   System.out.println("Printer is on standby");
               } else {
                   String removedFile = printingQueue.poll();
                   System.out.printf("Canceled %s%n", removedFile);
               }
            } else {
                printingQueue.offer(fileNames);
            }
            fileNames = scanner.nextLine();
        }

        for (String print : printingQueue) {
            System.out.println(print);

        }
    }
}
