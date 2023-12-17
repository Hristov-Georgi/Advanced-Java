package setsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> personEmails = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();
            personEmails.put(name, email);

            if (email.endsWith("us") || email.endsWith("uk") || email.endsWith("com")) {
                personEmails.remove(name);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> info : personEmails.entrySet()) {
            System.out.printf("%s -> %s%n", info.getKey(), info.getValue());

        }
    }
}
